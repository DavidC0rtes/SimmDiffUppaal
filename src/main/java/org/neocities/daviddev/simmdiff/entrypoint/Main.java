package org.neocities.daviddev.simmdiff.entrypoint;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Command(name = "NTASimmDiff", version = "NTASimmDiff 0.1", mixinStandardHelpOptions = true)
public class Main implements Runnable {

    @Option(names = {"--model"}, description = "Path to model file", required = true)
    File model;

    @Option(names = {"--mutant"}, description = "Path to mutant file", required = true)
    File mutant;

    @Option(names = {"-d", "--dir"}, description = "Working dir")
    String dir;

    @Override
    public void run() {
        if (dir == null) {
            dir = System.getProperty("user.dir");
        }
        System.out.println("Working Directory = " + dir);
        Runner runner = new Runner(model, mutant);
        runner.parseModels(dir);
        runner.parseTraces();
        runner.simulateTraces();
            /*FileLoader flModel = new FileLoader(model);
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

            Model bootstrapper = new Model(mutant, diff);

            String content = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<!DOCTYPE workers PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>\n" +
                    "<workers>\n" +
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
                    "</workers>");

            writer.write(content);*/
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