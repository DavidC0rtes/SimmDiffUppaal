package entrypoint;

import Parser.FileLoader;
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

    @Parameters(paramLabel = "<model>", arity = "2", description = "Path to model and mutant", index = "0")
    List<File> models;


    @Override
    public void run() {
        File model = models.get(0);
        File mutant = models.get(1);

        try {
            FileLoader fl = new FileLoader(model);
            FileLoader fl2 = new FileLoader(mutant);

            String outputFolder = "src/main/resources";

            Path resultFile1 = Files.writeString(Path.of(outputFolder, "parsed1.xml"), fl.getParsedContent());
            Path resultFile2 = Files.writeString(Path.of(outputFolder, "parsed2.xml"), fl2.getParsedContent());

            List<String> params = new ArrayList<>(Arrays.asList(
                    "diff",
                    "-u",
                    resultFile1.toString(),
                    resultFile2.toString()
            ));
            ProcessBuilder pb = new ProcessBuilder(params).inheritIO();
            pb.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
