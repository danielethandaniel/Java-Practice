package java_20260228.fighting2;

public class RoleTest {
    public static void main(String[] args) {

        Role r1=new Role("daniel",100);
        Role r2=new Role("aaa",100);

        for (int i = 1; r2.getBlood()>0; i++) {
            r1.fight(r2);
            System.out.println("第"+i+"次攻击");
        }

    }
}
