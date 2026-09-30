import java_20260320.Movie;

public class test {
    public static void main(String[] args) {
        Movie m1 = new Movie("出拳吧",39,1);
        Movie m2 = new Movie("水门桥",38,2);

        System.out.println(m1.getName() + " 价格是：" + m1.getPrice());
        System.out.println(m2.getName() + " 价格是：" + m2.getPrice());
    }
}
