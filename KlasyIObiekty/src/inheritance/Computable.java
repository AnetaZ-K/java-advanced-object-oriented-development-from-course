package pl.sda.inheritance;

import java.io.Serializable;

public interface Computable extends Serializable {

    int MAX_INT = 10;

    String add(String str1, String str2);

    default void compute() {

    }

}
