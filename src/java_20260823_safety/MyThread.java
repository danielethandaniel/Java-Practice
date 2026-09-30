package java_20260823_safety;

public class MyThread extends Thread {

    static int ticket = 0;

    //    锁对象一定是唯一的，不然相当于多个锁，没意义
//    static Object obj = new Object();


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyThread.class) {
                if (ticket < 100) {

                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
