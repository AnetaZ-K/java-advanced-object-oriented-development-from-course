package pl.sda.compare;

public class VersionMain {

    public static void main(String[] args) {

        Version version1 = new Version('a');
        Version version2 = new Version('d');

        System.out.println(version1.compareTo(version2));
        System.out.println(version2.compareTo(version1));

    }

}
