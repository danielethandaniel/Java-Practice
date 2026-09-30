package Java_20260928_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
 /*       ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(s -> s % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(collect);*/
/*
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        Map<String, Integer> collect = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));
        System.out.println(collect);*/



  /*      ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));*/


        ArrayList<String> manlist = new ArrayList<>();
        ArrayList<String> womanlist = new ArrayList<>();

        Collections.addAll(manlist, "蔡坤坤,24", "叶鹏威,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womanlist, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = manlist.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);


        Stream<String> stream2 = womanlist.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);


        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());


        System.out.println(list);
    }


    static class Actor {
        private String name;
        private int age;


        public Actor() {
        }

        public Actor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         * @return age
         */
        public int getAge() {
            return age;
        }

        /**
         * 设置
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return "Actor{name = " + name + ", age = " + age + "}";
        }
    }
}
