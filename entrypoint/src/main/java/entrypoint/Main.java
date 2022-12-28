package entrypoint;

import Parser.FileLoader;
import bootstrap.Bootstrapper;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Command(name = "NTASimmDiff", version = "NTASimmDiff 0.1", mixinStandardHelpOptions = true)
public class Main implements Runnable {

    @Parameters(paramLabel = "<model>", arity = "2", description = "Path to model and mutant, respectively", index = "0")
    List<File> models;


    @Override
    public void run() {
        File model = models.get(0);
        File mutant = models.get(1);

        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
