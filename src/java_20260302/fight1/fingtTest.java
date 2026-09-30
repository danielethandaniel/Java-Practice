package java_20260302.fight1;

public class fingtTest {
    public static void main(String[] args) {
        fighting r1 = new fighting("aaa",100);
        fighting r2 = new fighting("bbb",100);


        for (int i = 0; r2.getBlood() > 0 ; i++) {
            r1.fight(r2);
        }

    }
}
