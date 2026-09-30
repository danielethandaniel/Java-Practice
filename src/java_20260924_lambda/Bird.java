/*
package java_20260924_lambda;


import org.junit.jupiter.api.Test;


interface Flyable {
    void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("小鸟飞");
    }

    @Test
    public void Bird() {
        Bird bird = new Bird();
        bird.fly();
    }
}


class Bird2 {
    @Test
    public void Bird() {
        Flyable bird = new Flyable() {
            @Override
            public void fly() {
                System.out.println("大雁飞");
            }
        };

        bird.fly();
    }
}

class Bird4 {
    @Test
    public void Bird() {
        Flyable bird = () -> {
            System.out.println("大雁飞");
        };

        bird.fly();
    }
}


class Bird5 {
    @Test
    public void Bird() {
        Flyable bird = () -> {
            System.out.println("大雁飞");
        };
    }
}

class Bird6 {
    @Test
    public void Bird() {
        Flyable bird = () -> System.out.println("大雁飞");

        bird.fly();
    }
}


*/
