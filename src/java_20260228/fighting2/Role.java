package java_20260228.fighting2;

import java.util.Random;

public class Role {
    String name;
    int blood;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }



//    对战
    public void fight(Role enemy){
        //伤害
        Random r = new Random();
        int hurt = r.nextInt(20);

//        剩余血量
        int remain = enemy.getBlood() - hurt;
        enemy.setBlood(remain);
        System.out.println(this.getName()+"攻击"+enemy.getName()+"，扣除血量"+hurt+"，剩余血量"+remain);
    }
}
