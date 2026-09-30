package java_20260304;

public class Tset {
    public static void main(String[] args) {
        Baskerballsport a = new Baskerballsport("aaa",21);
        BasketballCoach b = new BasketballCoach("bbb",22);
        PingpongSporter c = new PingpongSporter("ccc",23);
        PingpangCoach d = new PingpangCoach("ddd",24);

        a.study();
        b.Teach();
        c.study();
        c.talk();
        d.Teach();
        d.talk();
    }
}
