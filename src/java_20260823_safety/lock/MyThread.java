package java_20260823_safety.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    //    锁对象一定是唯一的，不然相当于多个锁，没意义
//    static Object obj = new Object();

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            不能写在循环外面

            try {
                Thread.sleep(10);
//            synchronized (obj) {
                lock.lock();
                if (ticket < 100) {

                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
//            }
        }

    }
}
