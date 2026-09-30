package java_20260924_lambda;

import org.junit.jupiter.api.Test;

interface Swimmable {
    void swim();
}

public class Practice2 {

    // ============ 任务：把普通类写法改成匿名内部类 ============
    @Test
    void testSwimWithNormalClass() {
        class Goldfish implements Swimmable {
            @Override
            public void swim() {
                System.out.println("金鱼游啊游");
            }
        }
        Swimmable fish = new Goldfish();
        fish.swim();
    }


    @Test
    void testSwimWithNormalInnominateClass() {
        Swimmable fish = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("金鱼游啊游");
            }
        };
        fish.swim();
    }

    @Test
    void testSwimWithLambdaClass() {
        Swimmable fish = () -> {
            System.out.println("金鱼游啊游");
        };
        fish.swim();
    }

    @Test
    void testSwimWithLambda2Class() {
        Swimmable fish = () -> System.out.println("金鱼游啊游");
        fish.swim();
    }

}