package java_20260921_hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap_demo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);

        hm.put(s1, "江苏");
        hm.put(s2, "北京");
        hm.put(s3, "浙江");

        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
