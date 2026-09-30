package java_20260228;

public class phonetest {
    public static void main(String[] args) {
        phone p = new phone();

        p.brand="vivo";
        p.price=100;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.play();

        phone p2 = new phone();

        p2.brand="apple";
        p2.price=2000;
        System.out.println(p2.brand);
        System.out.println(p2.price);

        p.call();
        p2.play();
    }
}
