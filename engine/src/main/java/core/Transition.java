package core;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Todo:
 *  Guards, actions, clocks to be reset.
 */
public class Transition {
    private Location source;
    private Location target;

    public Transition(Location s, Location t) {
        source = s; target = t;
    }

    public Location getSource() {
        return source;
    }

    public Location getTarget() {
        return target;
    }

}
