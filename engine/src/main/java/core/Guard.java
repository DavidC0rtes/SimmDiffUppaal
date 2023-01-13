package core;

public class Guard {

    private String clockRef, comparisonOp;
    private float value;

    public Guard(String clockRef, String comparisonOp, float value) {
        this.clockRef = clockRef;
        this.comparisonOp = comparisonOp;
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public String getClockRef() {
        return clockRef;
    }

    public String getComparisonOp() {
        return comparisonOp;
    }
}
