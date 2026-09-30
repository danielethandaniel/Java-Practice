package java_20260330.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Programmer("张三", 18);
        Employee employee2 = new Designer("李四", 19);

        employee1.introduce();
        employee1.work();

        employee2.introduce();
        employee2.work();
    }
}
