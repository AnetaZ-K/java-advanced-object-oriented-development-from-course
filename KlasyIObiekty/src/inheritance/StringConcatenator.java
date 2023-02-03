package pl.sda.inheritance;

public class StringConcatenator implements Computable {
    @Override
    public String add(String str1, String str2) {

        if (str1 == null) {
            return str2;
        }

        if (str2 == null) {
            return str1;
        }

        return str1.concat(str2);
    }
}
