package java_20260924_lambda;

import org.junit.jupiter.api.Test;

interface Calculator {
    int calc(int a, int b);
}

public class Practice4 {
    // 任务 1：改成匿名内部类
    @Test
    void testCalcAnonymous() {
        class SumCalc implements Calculator {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        }
        Calculator cal = new SumCalc();
        int res = cal.calc(10, 20);
        System.out.println("求和结果：" + res);
    }

    @Test
    void testCalcAnonymous2() {
        Calculator cal = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        int res = cal.calc(10, 20);
        System.out.println("求和结果：" + res);
    }

    @Test
    void testCalcAnonymous3() {
        Calculator cal = (a, b) -> a + b;
        int res = cal.calc(10, 20);
        System.out.println("求和结果：" + res);
    }

    @Test
    void testCalcAnonymous4() {
        Calculator cal = (a, b) -> a + b;
        int res = cal.calc(10, 20);
        System.out.println("求和结果：" + res);
    }
}
