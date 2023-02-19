package org.neocities.daviddev.simmdiff.entrypoint;

import de.tudarmstadt.es.juppaal.NTA;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;

public class Engine {
    private ExtendedNTA model, mutant;
    public Engine(ExtendedNTA model, ExtendedNTA mutant) {
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
        mutant.compareNTA(model);
    }
}
