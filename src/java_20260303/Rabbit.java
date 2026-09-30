package java_20260303;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃饭");
    }
}
