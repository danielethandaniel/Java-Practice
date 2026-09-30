package java_20260330.Polymorphism;

public class Designer extends Employee{
    public Designer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在设计");
    }
}
