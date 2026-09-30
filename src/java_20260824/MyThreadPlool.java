package java_20260824;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class MyThreadPlool {

    @Test
    void MyThreadPlool() {
        //        1.获取线程池对象 没有上限
        ExecutorService pool1 = Executors.newCachedThreadPool();

//        2.提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());


//        3.关闭线程池
//        pool1.shutdown();
    }


    @Test
    void MyThreadPlool2() {
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());

    }


    @Test
    void MyThreadPlool3() {
        ThreadPoolExecutor ThreadPool = new ThreadPoolExecutor(
                3,   //  核心线程数量
                6,//  最大线程数量
                60,//  线程最大存活时间
                TimeUnit.SECONDS,//  时间单位
                new ArrayBlockingQueue<>(3), //  任务队列
                Executors.defaultThreadFactory(),// 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略

        );

        ExecutorService pool = Executors.newFixedThreadPool(4);
        pool.execute(() -> System.out.println("task"));
//        一个接口必须只有一个方法
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("task");
            }
        });


    }


}








