package java_20260815_object;

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void keepPet(dog dog, String something) {
        System.out.println("给狗喂狗粮");
    }

    public void keepPet(cat cat, String something) {
        System.out.println("给猫喂猫粮");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
