package java_20260304;

public class Baskerballsport extends Sporter {
    public Baskerballsport() {
    }

    public Baskerballsport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学篮球");
    }


}
