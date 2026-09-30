package java_20260331;

public class Test{
    public static void main(String[] args) {
        Inter emp1 = new Programmer("张三", 18);
        Inter emp2 = new Designer("李四", 19);

        emp1.introduce();
        emp1.work();
        emp2.introduce();
        emp2.work();
    }
}
