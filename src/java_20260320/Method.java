package java_20260320;

public class Method {
    public static void main(String[] args) {
        launch();
        launch("山东");
        launch("山东", 5);

    }

    public static void launch() {
        System.out.println("发射一枚武器");
    }

    public static void launch(String a) {
        System.out.println("在" + a + "发射一枚武器");
    }

    public static void launch(String a, int i) {
        System.out.println("在" + a + "发射" + i + "枚武器");
    }

}