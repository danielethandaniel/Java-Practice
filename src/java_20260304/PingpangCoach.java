package java_20260304;

public class PingpangCoach extends Coach implements English{
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("Teaching Pingpang Coach");
    }

    @Override
    public void talk() {
        System.out.println("I can speak English");
    }
}
