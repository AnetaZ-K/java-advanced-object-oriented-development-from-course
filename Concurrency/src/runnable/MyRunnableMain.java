package pl.sda.runnable;

public class MyRunnableMain {

    public static void main(String[] args) {

        //new Thread(new MyRunnable(), "MyRunnable-1").start();

        Thread [] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable(), "MyRunnable-" + i);
            threads[i].start();

            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
