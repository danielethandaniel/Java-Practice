package Java_20260507_Stream;

import java.util.ArrayList;

public class Stream_demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三11");
        list.add("张三2");
        list.add("李四11");
        list.add("李四2");
        list.add("王五11");
        list.add("王五2");

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3) {
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
