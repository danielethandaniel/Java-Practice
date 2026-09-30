package java_20260822_thread.thread3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }

        System.out.println("MyCallable执行结束");
        return sum;
    }
}
