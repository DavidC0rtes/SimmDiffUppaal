package org.neocities.daviddev.simmdiff.workers;

import java.util.concurrent.Callable;

public class Tron implements Callable<Boolean> {

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
    public Boolean call() throws Exception {
        ProcessBuilder pb = new ProcessBuilder("bash", "-c",
                tronPath + " " +
                model + " -v 8 -q " +
                "-I TraceAdapter " +
                "-- -m " + preamble +
                " < " + trace
        );
        Process p = pb.start();

        String result = new String(p.getInputStream().readAllBytes());
        return !result.contains("FAILED");
    }
}
