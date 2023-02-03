package pl.sda.thread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {


        synchronized (MyThread.class) {

            for (int i = 0; i < 10; i++) {
                System.out.println("Watek o nazwie " + getName() + " wykonał " + i + " instrukcji");

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
