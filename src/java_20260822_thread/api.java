package java_20260822_thread;

public class api {
    public static void main(String[] args) throws InterruptedException {

        // setName / getName 设置获取线程名
        Thread t1 = new Thread(() -> {
            // currentThread()：获取当前正在执行的线程对象
            Thread curr = Thread.currentThread();
            System.out.println("t1线程名：" + curr.getName());
            System.out.println("t1线程优先级：" + curr.getPriority());

            for (int i = 0; i < 3; i++) {
                System.out.println(curr.getName() + " >>> " + i);
                try {
                    // sleep：当前线程休眠毫秒，不释放锁
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // setName 设置线程名字
        t1.setName("我的工作线程");
        // setPriority 设置优先级 1~10
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        System.out.println("t1默认是否守护线程：" + t1.isDaemon());

        // setDaemon 设置守护线程，必须在start之前！
        // t1.setDaemon(true);

        t1.start();

        // main线程打印自己信息
        Thread mainThread = Thread.currentThread();
        System.out.println("main线程名：" + mainThread.getName());
        System.out.println("main线程优先级：" + mainThread.getPriority());

        // yield：主动让出CPU，只是建议，不一定生效
        System.out.println("main执行yield...");
        Thread.yield();

        // join：main线程等待t1执行完毕，main才继续往下走
        t1.join();
        System.out.println("t1执行完毕，main线程结束");
    }
}
