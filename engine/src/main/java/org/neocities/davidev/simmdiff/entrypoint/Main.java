package org.neocities.davidev.simmdiff.entrypoint;

import org.neocities.davidev.simmdiff.bootstrap.Bootstrapper;
import org.neocities.davidev.simmdiff.core.Runner;
import org.neocities.davidev.simmdiff.grammars.uppaal.FileLoader;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Command(name = "NTASimmDiff", version = "NTASimmDiff 0.1", mixinStandardHelpOptions = true)
public class Main implements Runnable {

    @Option(names = {"--model"}, description = "Path to model file", required = true)
    File model;

    @Option(names = {"--mutant"}, description = "Path to mutant file", required = true)
    File mutant;

    @Override
    public void run() {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            System.out.println("Thesis");

            FileLoader flModel = new FileLoader(model);
            FileLoader flMutant = new FileLoader(mutant);

            String outputFolder = "src/main/resources";

            Path resultModel = Files.writeString(Path.of(outputFolder, "parsedModel.xml"), flModel.getParsedContent());
            Path resultMutant = Files.writeString(Path.of(outputFolder, "parsedMutant.xml"), flMutant.getParsedContent());

            List<String> params = new ArrayList<>(Arrays.asList(
                    "diff",
                    "-ub",
                    "--suppress-common-lines",
                    resultMutant.toString(),
                    resultModel.toString()
            ));
            ProcessBuilder pb = new ProcessBuilder(params);
            Process proc = pb.start();

            String diff = new String(proc.getInputStream().readAllBytes());

            Bootstrapper bootstrapper = new Bootstrapper(mutant, diff);

            String content = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>\n" +
                    "<nta>\n" +
                    "<declaration></declaration>\n";

            Runner runner = bootstrapper.getRunner();
            content = content.concat(runner.getXMLContent());
            content = content.concat("<system>// Place template instantiations here.\n" +
                    "Process = Template();\n" +
                    "// List one or more processes to be composed into a system.\n" +
                    "system Process;\n" +
                    "    </system>\n" +
                    "<queries>\n" +
                    "<query>\n" +
                    "<formula></formula>\n" +
                    "<comment></comment>\n" +
                    "</query>\n" +
                    "</queries>\n" +
                    "</nta>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    private void writeContents(String content) {
        File smallerMutant = new File("src/main/resources/output.xml");
        try (FileWriter writer = new FileWriter(smallerMutant);){
            writer.write(content);
        } catch (IOException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }
}