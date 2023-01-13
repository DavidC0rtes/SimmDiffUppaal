package core;

import core.types.Clock;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Orchestrates TAIOs
 */
public class Runner {
    private HashMap<String, Automata> automataHashMap;
    private HashMap<String, Clock> globalClocks;

    public void Runner(HashMap<String, Automata> automatas, HashMap<String, Clock> clocks) {
        automataHashMap = automatas;
        globalClocks = clocks;
    }

    /**
     * Initialize clocks,
     * get enabled transitions, (reachability, bias)
     * choose non-deterministically from above set.
     * get enabled transitions ...
     * ...
     */
    public void start() {
        globalClocks.values().forEach(Clock::run);
        int i = 0;
        for (Automata taio : automataHashMap.values()) {
            // Todo: This should be done in a thread for every TAIO.
            if (i == 0) taio.setCurrLocation(taio.getInitLocation());
            taio.getEnabledTransitions(globalClocks);


            i++;
        }
    }

}
