package java_20260330.NoPolymorphism;

public class Programmer extends Employee {

    public Programmer(String name, int age) {
        super(name, age);
    }
    public static void main(String[] args) {
        Programmer programmer = new Programmer("张三", 18);
        programmer.introduce();
        programmer.work();
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在写代码");
    }
}
