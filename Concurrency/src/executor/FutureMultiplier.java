package pl.sda.executor;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class FutureMultiplier implements Callable<BigInteger> {

    private BigInteger multiplicand1;

    private BigInteger multiplicand2;

    private String name;

    public FutureMultiplier(BigInteger multiplicand1, BigInteger multiplicand2, String name) {
        this.multiplicand1 = multiplicand1;
        this.multiplicand2 = multiplicand2;
        this.name = name;
    }

    @Override
    public BigInteger call() {

        System.out.println("Start obliczeń wątku o nazwie: " + name);

        BigInteger result = multiplicand1.multiply(multiplicand2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Koniec obliczeń wątku o nazwie: " + name);

        return result;
    }
}
