package java_20260814_ArrayList;

import java.util.*;

// 集合
//1.长度可变
//2.不能直接存基本数据类型，只能存引用数据类型
//3.泛型：限定集合中存储数据的类型
public class Array {
    public static void main(String[] args) {

        class Student1 {
            int id;
            String name;


            public Student1() {
            }

            public Student1(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student1{id=" + id + ",name='" + name + "'}";
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Student1> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
//
        Student1 lihua = new Student1();
        Student1 lihub = new Student1();
//
////        增
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        list2.add(lihua);
//        list2.add(lihub);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int id = sc.nextInt();
        for (int i = 0; i < list2.size(); i++) {
//            Student1 stu = list2.get(i);
//            System.out.println(stu.getId() + "," + stu.getName())

            System.out.println(list2.get(i).getId() + "," + list2.get(i).getName());

        }

//
//        System.out.println(list2);
//
//
////        删
//        list.remove(0);
//
//        list.remove(3);
//
//        list2.remove(lihua);
//
////        改  变量set接收旧值
//        Integer set = list.set(0, 1);
//        System.out.println(set);
//
////        查
//        Integer get = list.get(0);
//        System.out.println(get);


//        list3.add("aaa");
//        list3.add("aaa");
//        list3.add("aaa");
//
//        for (int i = 0; i < list3.size(); i++) {
//            if (i == list3.size() - 1) {
//                System.out.println(list3.get(i));
//            } else {
//                System.out.print(list3.get(i) + ",");
//            }
//        }

        System.out.println("========== Map / HashMap / TreeMap ==========");

        // ===== Map 接口 =====
        // Map 存储键值对（key-value），key 不能重复
        Map<String, String> map = new HashMap<>();

        // 增（put）
        map.put("张三", "北京");
        map.put("李四", "上海");
        map.put("王五", "广州");
        System.out.println("HashMap: " + map);

        // 删（remove）  返回被删除的 value
        String removed = map.remove("李四");
        System.out.println("删除李四: " + removed);
        System.out.println("删除后: " + map);

        // 改（put 已存在的 key 会覆盖）  返回旧值
        String old = map.put("张三", "深圳");
        System.out.println("覆盖张三旧值: " + old);
        System.out.println("覆盖后: " + map);

        // 查（get）  key 不存在返回 null
        String city = map.get("王五");
        System.out.println("王五的城市: " + city);

        // 判断 key 是否存在
        System.out.println("包含张三? " + map.containsKey("张三"));
        System.out.println("包含北京? " + map.containsValue("北京"));

        // 遍历 keySet
        System.out.println("--- keySet 遍历 ---");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 遍历 entrySet
        System.out.println("--- entrySet 遍历 ---");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ===== HashMap =====
        // 无序（不保证插入顺序），允许 null key / null value
        HashMap<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("数学", 90);
        scoreMap.put("英语", 85);
        scoreMap.put("语文", 92);
        System.out.println("HashMap 成绩: " + scoreMap);

        // 遍历
        for (String subject : scoreMap.keySet()) {
            System.out.println(subject + ": " + scoreMap.get(subject));
        }

        // ===== TreeMap =====
        // 按 key 自然排序（String 按字母/字典序），不允许 null key
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 5);
        treeMap.put("cherry", 2);
        System.out.println("TreeMap（自动排序）: " + treeMap);

        // 遍历（有序输出）
        for (String key : treeMap.keySet()) {
            System.out.println(key + " -> " + treeMap.get(key));
        }

        // TreeMap 自定义对象需要 Student1 实现 Comparable 或传入 Comparator
        TreeMap<Integer, Student1> stuTreeMap = new TreeMap<>();
        stuTreeMap.put(3, new Student1(3, "Tom"));
        stuTreeMap.put(1, new Student1(1, "Jerry"));
        stuTreeMap.put(2, new Student1(2, "Alice"));
        System.out.println("TreeMap<Student1>（按 key 排序）: ");
        for (Integer key : stuTreeMap.keySet()) {
            System.out.println(key + " -> " + stuTreeMap.get(key));
        }
    }

}

