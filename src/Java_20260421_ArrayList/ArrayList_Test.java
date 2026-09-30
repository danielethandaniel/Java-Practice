package Java_20260421_ArrayList;

import java.util.ArrayList;

public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

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
