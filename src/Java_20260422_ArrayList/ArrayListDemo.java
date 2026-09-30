package Java_20260422_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("张三", "123", "1");
        User u2 = new User("李四", "456", "2");
        User u3 = new User("王五", "789", "3");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("请输入用户id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        User user = login(list, id);
        
        if (user != null) {
            System.out.println("登录成功！用户信息：");
            System.out.println("用户名：" + user.getUsername());
            System.out.println("密码：" + user.getPassword());
            System.out.println("ID：" + user.getId());
        } else {
            System.out.println("未找到该用户！");
        }
    }

    public static User login(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return list.get(i);
            }
        }
        return null;
    }
}

