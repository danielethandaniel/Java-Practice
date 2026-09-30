package Java_20260928_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

//收集List集合当中
//需求：
//我要把所有的男性收集起来

/*        list.stream().filter(sex -> "男".equals(sex.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(list);*/

        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(map);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("张无忌");
//        list.add("周郑若");
//        list.add("赵敏");
//        list.add("张强");
//        list.add("张三丰");
//
//        list.stream()
//                .filter(name -> name.startsWith("张"))
//                .filter(name -> name.length() == 3)
//                .forEach(name -> System.out.println(name));
//
//        list.stream().distinct().forEach(System.out::println);


/*
        1.把所有"张"开头的存储到新集合

        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                list2.add(name);
            }
        }
        System.out.println(list2);


        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                list3.add(name);
            }
        }
        System.out.println(list3);

        for (String name : list3) {
            System.out.println(name);
        }*/

    }
}
