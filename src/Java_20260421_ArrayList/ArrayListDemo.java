package Java_20260421_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

//       增加
        list.add("a");
        list.add("b");
        list.add("c");

   /*     System.out.println(list);

//        删除
        list.remove(0);
        System.out.println(list);

//        修改
        list.set(0, "modification");
        System.out.println(list);*/

//        查询
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

}
