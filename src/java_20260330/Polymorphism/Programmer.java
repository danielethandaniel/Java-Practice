package java_20260330.Polymorphism;

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在写代码");
    }
}
