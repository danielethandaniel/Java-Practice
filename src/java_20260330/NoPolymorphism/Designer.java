package java_20260330.NoPolymorphism;

public class Designer extends Employee {

    public Designer(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Designer designer = new Designer("李四", 19);
        designer.introduce();
        designer.work();
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在设计");
    }
}
