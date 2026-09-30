package java_20260303;

public class Forg extends Animal implements Swim{

    public Forg() {
    }

    public Forg(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Forg eating");
    }

    @Override
    public void swim() {
        System.out.println("Forg swim");
    }
}
