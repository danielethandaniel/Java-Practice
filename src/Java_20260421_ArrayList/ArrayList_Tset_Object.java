package Java_20260421_ArrayList;

import java.util.ArrayList;

public class ArrayList_Tset_Object {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student a = new Student("张三", 18);
        Student b = new Student("李四", 19);
        Student c = new Student("王五", 20);

        list.add(a);
        list.add(b);
        list.add(c);


        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ',' + stu.getAge());
        }
    }
}
