package java_20260331;

public class Designer extends Employ implements Inter{
    public Designer() {
    }

    public Designer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在设计");
    }

    @Override
    public void introduce() {
        System.out.println("我叫" + getName() + "，今年" + getAge() + "岁");
    }
}
