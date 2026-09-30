package java_20260822_thread.thread2;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; 1 < 100; i++) {
            System.out.println("hello" + Thread.currentThread());
        }
    }

}
