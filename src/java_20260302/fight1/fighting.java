package java_20260302.fight1;

import java.util.Random;

public class fighting {
    private String name;
    private int blood;

    public fighting() {
    }

    public fighting(String name, int blood) {
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

    public void fight(fighting enemy) {
        Random r = new Random();
        int hurt = r.nextInt(20);

        int remain = enemy.getBlood()-r.nextInt(20);
        enemy.setBlood(remain);

        System.out.println(this.name+ "打了"+ enemy.getName()+"一拳，造成伤害"+hurt+"，剩余血量"+enemy.getBlood());
    }
}

