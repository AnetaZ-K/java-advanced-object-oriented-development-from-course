package pl.sda.thread;

public class MyThreadMain {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("watek 1");
        MyThread myThread2 = new MyThread("watek 2");
        MyThread myThread3 = new MyThread("watek 3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

}
