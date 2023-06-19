package org.neocities.daviddev.tracematcher.core.types;

public class Channel {

    private final String name;
    private final String scope;
    private final ChanType type;

    public Channel(String name, String scope, ChanType type) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    public static enum ChanType {
        BROADCAST,
        URGENT,
        BINARY
    }

    @Override
    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }

        if (!(o instanceof Channel)) {
            return false;
        }

        Channel chan = (Channel) o;

        if (!this.name.equals(chan.getName())) {
            return false;
        }

        if (!this.type.equals(chan.getType())) {
            return false;
        }

        return this.scope.equals(chan.getScope());
    }

    @Override
    public int hashCode() {
        int result = 34;
        result = 72 * result + name.hashCode();
        result = 72 * result + scope.hashCode();
        result = 72 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getScope() {
        return scope;
    }

    public ChanType getType() {
        return type;
    }
}
