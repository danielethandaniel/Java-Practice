package java_20260822_thread.thread1;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello" + getName());
        }
    }
}
