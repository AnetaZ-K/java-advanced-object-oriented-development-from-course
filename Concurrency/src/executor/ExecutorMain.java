package pl.sda.executor;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMain {

    public static void main(String[] args) throws Exception {

        BigInteger int1 = new BigInteger("2352353252524524542524425245245");
        BigInteger int2 = new BigInteger("568576856776576576453231231213131314244242234");
        FutureMultiplier futureMultiplier = new FutureMultiplier(int1, int2, "multiplier-1");

        ExecutorService executorService =  Executors.newSingleThreadExecutor();
        Future<BigInteger> futureResult = executorService.submit(futureMultiplier);

        executorService.shutdown();

        for (int i = 0; i < 10; i++) {
            System.out.println("Czekam na wynik obliczeń");
        }

        System.out.println(futureResult.get());

    }

}
