package Java_20260424_ArraayList;

import java.util.ArrayList;

public class ArrayList_Demo {
    static ArrayList<Phone> list = new ArrayList<>();

    public static void main(String[] args) {

        Phone p1 = new Phone("华为", 9999);
        Phone p2 = new Phone("苹果", 8888);
        Phone p3 = new Phone("小米", 1000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Phone result = getPhone();
        System.out.println("价格<=1000的手机是：" + result);
    }

    public static Phone getPhone() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= 1000) {
                return list.get(i);
            }
        }
        return null;
    }
}
