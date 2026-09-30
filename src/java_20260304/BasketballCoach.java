package java_20260304;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("教篮球");
    }
}
