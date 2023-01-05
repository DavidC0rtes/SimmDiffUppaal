package core;

public class Location {

    private boolean isBias = false;
    private String id;

    public Location( String id, boolean bias) {
        isBias = bias;
        this.id = id;
    }


    public boolean hasBias() {
        return isBias;
    }
}
