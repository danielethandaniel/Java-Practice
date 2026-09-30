package java_20260822_thread.thread2;

public class ThreadDemo {
    public static void main(String[] args) {
//        表示要执行的任务
        Thread2 mr = new Thread2();


        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();


    }
}
