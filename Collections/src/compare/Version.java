package pl.sda.compare;

public class Version implements Comparable<Version> {

    private char type;

    public Version(char type) {
        this.type = type;
    }


    @Override
    public int compareTo(Version version) {
//        return this.type - version.type;
        return Character.compare(this.type, version.type);
    }
}
