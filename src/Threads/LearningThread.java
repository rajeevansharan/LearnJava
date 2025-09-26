package Threads;

class MyThread extends Thread {
    public void run() {
        int a;
        for (a = 1; a <= 10; a++) {
            System.out.println("Hii");
        }

    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Sharan");
    }
}


public class LearningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Runnable run = new MyRunnable();
        Thread t2 = new Thread(run);

        t1.start();
        t2.start();

    }
}
