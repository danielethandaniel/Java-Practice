/*
package java_20260924_lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

interface Flyable {
    void fly();
}

interface Calculator {
    int compute(int a, int b);
}

public class Practice {

    // ============ 练习 1：普通类 → 匿名内部类 ============
    @Test
    void testFlyableWithNormalClass() {
        class Sparrow implements Flyable {
            @Override
            public void fly() {
                System.out.println("麻雀飞");
            }
        }
        Flyable bird = new Sparrow();
        bird.fly();
    }

    @Test
    void testFlyableWithNormalClassDemo() {
        Flyable bird = new Flyable() {
            @Override
            public void fly() {
                System.out.println("麻雀飞");
            }
        };
        bird.fly();
    }

    @Test
    void testFlyableWithNormalClassLambda() {
        Flyable bird = () -> {
            System.out.println("麻雀飞");
        };
        bird.fly();
    }


    @Test
    void testFlyableWithNormalClassLambda2() {
        Flyable bird = () -> System.out.println("麻雀飞");
        bird.fly();
    }


    // ============ 练习 2：匿名内部类 → Lambda ============
    @Test
    void testCalculatorWithAnonymousClass() {
        Calculator add = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        };
        assertEquals(7, add.compute(3, 4));
    }


   */
/* // ============ 练习 3：匿名内部类 → Lambda → 方法引用 ============
    @Test
    void testSortWithAnonymousClass() {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "hi", "watermelon"));

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        assertEquals(List.of("hi", "apple", "banana", "watermelon"), words);
    }*//*

}*/
