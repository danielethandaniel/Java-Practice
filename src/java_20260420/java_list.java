package java_20260420;

import java.util.ArrayList;

public class java_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        boolean result = list.remove("aaa");
        System.out.println(result);
        System.out.println(list);
    }
}
