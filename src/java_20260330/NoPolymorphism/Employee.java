package java_20260330.NoPolymorphism;

public abstract class Employee {
    String name;
    int age;

    public void introduce (){
        System.out.println("我叫"+name+"，今年"+age+"岁");
    }

    public abstract void work();

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

