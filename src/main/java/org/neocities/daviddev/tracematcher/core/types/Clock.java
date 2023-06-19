package org.neocities.daviddev.tracematcher.core.types;

public class Clock implements Runnable {
    private float value;
    private long t1;
    private String id;

    public Clock(String identifier) {
        value = 0;
        id = identifier;
    }

    public void stop() {
        setValue(System.currentTimeMillis() - t1);
    }

    public float getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public void run() {
        t1 = System.currentTimeMillis();
    }
}
