package java_20260331;

import java_20260330.Polymorphism.Employee;

public class Programmer extends Employ implements Inter {
    public Programmer() {
    }

    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在写代码");
    }

    @Override
    public void introduce() {
        System.out.println("我叫" + getName() + "，今年" + getAge() + "岁");
    }
}
