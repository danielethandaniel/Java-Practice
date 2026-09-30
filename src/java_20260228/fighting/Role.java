package java_20260228.fighting;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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

    public void fight(Role enemy) {
//        daniel 打了 john 一下
        Random r = new Random();
        int hurt = r.nextInt(20);

//        剩余血量
        int remainBlood = enemy.getBlood() - hurt;
        enemy.setBlood(remainBlood);
        System.out.println(this.getName() + "打了" + enemy.getName() + "一下,造成"+ hurt+ "点伤害,"+enemy.getName()+"剩余血量"+remainBlood);
    }
}
