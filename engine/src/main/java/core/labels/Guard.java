package core.labels;

public class Guard {
    private String clockRef, comparisonOp;
    private String[] left, right;
    /**
     * Creates a new Guard element
     * @param left name of the clock variable.
     * @param comparisonOp comparison operator.
     * @param right right hand side value.
     */
    public Guard(String[] left, String comparisonOp, String[] right) {
        this.left = left;
        this.comparisonOp = comparisonOp;
        this.right = right;
    }

    public String getClockRef() {
        return clockRef;
    }

    public String getComparisonOp() {
        return comparisonOp;
    }
}
