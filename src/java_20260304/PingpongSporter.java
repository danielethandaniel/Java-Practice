package java_20260304;

public class PingpongSporter extends Sporter implements English {
    public PingpongSporter() {
    }

    public PingpongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("I can speak English");

    }

    @Override
    public void study() {
        System.out.println("I am Pingpangsport");

    }
}
