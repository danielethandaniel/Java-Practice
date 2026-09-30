package Java_20260421_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Test_Objcet_Scanner {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("输入姓名");
            String name = sc.next();
            System.out.println("输入年龄");
            int age = sc.nextInt();

            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }
    }

}
