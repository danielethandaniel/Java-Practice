package java_20260822_thread.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        Integer result = null;

        result = ft.get();


        System.out.println(result);
        
    }
}
