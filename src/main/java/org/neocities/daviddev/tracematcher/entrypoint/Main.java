package org.neocities.daviddev.tracematcher.entrypoint;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;

@Command(name = "TraceMatcher", version = "TraceMatcher 1.0", mixinStandardHelpOptions = true)
public class Main implements Runnable {
    enum Strategies { random, biased }

    @Option(names = {"--model"}, description = "Path to first model.", required = true)
    File model;

    @Option(names = {"--mutant"}, description = "Path to second model.", required = true)
    File mutant;

    @Option(names = "--how", description = "How to generate traces, one of: ${COMPLETION-CANDIDATES}.", required = true, defaultValue = "biased")
    Strategies strategy;
    @Option(names = {"-d", "--dir"}, description = "Working directory.")
    String dir;

    @Override
    public void run() {
        if (dir == null) {
            dir = System.getProperty("user.dir");
        }
        System.out.println("Working Directory = " + dir);
        Runner runner = new Runner(model, mutant);
        runner.parseModels();
        runner.computeTraces(dir, strategy.toString());
        runner.parseTraces(strategy.toString());
        runner.simulateTraces();
        System.out.printf("Result of traces inclusion: %s\n", runner.getVeredict());
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new Main());
        commandLine.setCaseInsensitiveEnumValuesAllowed(true);

        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}