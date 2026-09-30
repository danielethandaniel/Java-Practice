package java_20260924_lambda;

import org.junit.jupiter.api.Test;

interface Eater {
    void eat(String food);
}

public class Practice3 {

    @Test
    void testEatWithNormalClass() {
        class Panda implements Eater {
            @Override
            public void eat(String food) {
                System.out.println("熊猫吃" + food);
            }
        }
        Eater e = new Panda();
        e.eat("竹子");
    }

    @Test
    void testEatWithNormalInnominateClass() {
        Eater e = new Eater() {
            @Override
            public void eat(String food) {
                System.out.println("熊猫吃" + food);
            }
        };
        e.eat("竹子");
    }

    @Test
    void testEatWithNormalLambdaClass2() {
        Eater e = (food) -> System.out.println("熊猫吃" + food);
        e.eat("竹子");
    }

}