package Java_20260421_ArrayList;

import java.util.ArrayList;

public class ArrayList_Test_Integer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print('[');
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(',');
            } else {
                System.out.print(']');
            }
        }
    }
}
