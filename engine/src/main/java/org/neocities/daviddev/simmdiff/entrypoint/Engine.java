package org.neocities.daviddev.simmdiff.entrypoint;

import de.tudarmstadt.es.juppaal.NTA;

public class Engine {
    private NTA model, mutant;
    public Engine(NTA model, NTA mutant) {
        this.mutant=mutant; this.model=model;
    }

    public void start() {
        /*
        todo:
        extend NTA class
        add method to compare it against another NTA
        save elements which are different
        add method to generate XML only with different elements in each TA(?)
         */
    }
}
