package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.base.Function;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Command(name = "NTASimmDiff", version = "NTASimmDiff 0.1", mixinStandardHelpOptions = true)
public class Main implements Runnable {
    enum Strategies {
        random,
        biased
    }

    @Option(names = {"--model"}, description = "Path to model file", required = true)
    File model;

    @Option(names = {"--mutant"}, description = "Path to mutant file", required = true)
    File mutant;

    @Option(names = "-how", description = "How to generate traces, one of: ${COMPLETION-CANDIDATES}", required = true)
    Strategies strategy;
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
        runner.computeTraces(dir, strategy.toString());
        runner.parseTraces(strategy.toString());
        runner.simulateTraces();
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new Main());
        commandLine.setCaseInsensitiveEnumValuesAllowed(true);

        int exitCode =commandLine.execute(args);
        System.exit(exitCode);
    }
}