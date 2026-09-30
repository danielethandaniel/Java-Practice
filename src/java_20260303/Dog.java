package java_20260303;

public class Dog extends Animal implements Swim {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }
}
