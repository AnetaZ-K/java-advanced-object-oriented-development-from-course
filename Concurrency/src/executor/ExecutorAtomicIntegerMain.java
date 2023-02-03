package pl.sda.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorAtomicIntegerMain {

    public static void main(String[] args) throws Exception {


        AtomicInteger atomicInteger = new AtomicInteger(1);
        List<Callable<Integer>> actions = Arrays.asList(
                () -> atomicInteger.addAndGet(1),
                () -> atomicInteger.decrementAndGet(),
                () -> atomicInteger.addAndGet(20)
        );

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<Integer>> results = executorService.invokeAll(actions);
        for (Future<Integer> result : results) {
            System.out.println(result.get());
        }
    }

}
