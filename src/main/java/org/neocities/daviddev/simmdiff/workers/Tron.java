package org.neocities.daviddev.simmdiff.workers;


import java.io.File;
import java.util.concurrent.Callable;

public class Tron implements Callable<String> {

    private final String tronPath, model, preamble, trace;
    public Tron(String tronPath, String model, String preamble, String trace) {
        this.tronPath = tronPath;
        this.model = model;
        this.preamble = preamble;
        this.trace = trace;
    }
    /**
     * Calls UPPAAL TRON to check if the given model can perform the given trace.
     * @return true if tron outputs anything other than TEST FAILED, i.e, if the model can simulate
     * the given trace or if it is inconclusive, false otherwise.
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        String command = tronPath + " " +
                model + " -v 8 -Q log " +
                "-I TraceAdapter " +
                "-- -m " + preamble
                + " < " + trace;
        ProcessBuilder pb = new ProcessBuilder("bash", "-c",
                tronPath + " " +
                model + " -v 8 -Q log " +
                "-I TraceAdapter " +
                "-- -m " + preamble
                + " < " + trace
        );

        System.out.println("Calling tron with trace "+ command);
        Process p = pb.start();
        p.waitFor();

        String result = new String(p.getInputStream().readAllBytes());
        if (result.contains("FAILED")) {
            System.out.println("fail");
            return "FAILED";
        } else if (result.contains("Time out for testing")) {
            System.out.println("timeout");
            return "TIMEOUT";
        } else if (result.contains("PASSED")) {
            System.out.println("pass");
            return "PASSED";
        }
        System.out.println("Error probably");
        return "INCONCLUSIVE";
    }
}
