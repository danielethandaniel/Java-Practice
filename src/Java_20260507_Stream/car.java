package Java_20260507_Stream;

/*内部类可以访问外部类的成员变量和成员方法
外部类要访问成员变量和成员方法，必须创建对象*/
public class car {
    String name;
    int Age;
    String Color;

    public void show() {
        System.out.println(name);

        Engine engine = new Engine();
        engine.brand = "Benz";
        System.out.println(engine.brand);
    }

    class Engine {
        private String brand;
        private int EngineAge;
    }
}
