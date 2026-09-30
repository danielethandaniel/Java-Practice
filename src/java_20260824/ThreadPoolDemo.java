package java_20260824;

import java.util.concurrent.*;

/**
 * 线程池基础demo
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 手动创建线程池，7个参数
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,                              //核心线程数
                4,                              //最大线程数
                5L,                             //非核心线程空闲时间
                TimeUnit.SECONDS,               //时间单位
                new ArrayBlockingQueue<>(5),    //有界阻塞队列，最多存放5个等待任务
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy() //拒绝策略：抛异常
        );

        // 模拟提交12个任务
        for (int i = 1; i <= 12; i++) {
            int taskId = i;
            try {
                // execute：无返回值提交任务
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " 正在执行任务：" + taskId);
                    try {
                        //模拟任务耗时
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("任务被中断:" + taskId);
                    }
                });
                System.out.println("提交任务:" + taskId);
            } catch (RejectedExecutionException e) {
                System.err.println("任务" + taskId + "被拒绝，线程池满了");
            }
        }

        // 关闭线程池，不再接收新任务，等待已提交任务执行完毕
        threadPool.shutdown();

        //等待线程池全部结束，最多等待30秒
        try {
            if (!threadPool.awaitTermination(30, TimeUnit.SECONDS)) {
                //超时还没结束，强制关闭
                threadPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
        }
        System.out.println("main主线程结束");
    }
}
