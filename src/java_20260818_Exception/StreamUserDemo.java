package java_20260818_Exception;

import java.util.*;
import java.util.stream.Collectors;

class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public User(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ",name='" + name + "',age=" + age + ",sex='" + sex + "'}";
    }
}

public class StreamUserDemo {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User(1, "张三", 16, "男"),
                new User(2, "李四", 22, "女"),
                new User(3, "王五", 28, "男"),
                new User(4, "赵六", 19, "女"),
                new User(5, "孙七", 33, "男"),
                new User(5, "孙七", 33, "男") // 重复对象用于distinct演示
        );

        // 1.filter 过滤：保留年龄大于18
        List<User> filterList = userList.stream()
                .filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("filter过滤年龄>18：" + filterList);

        // 2.map映射：提取所有用户id
        List<Integer> idList = userList.stream()
                .map(User::getId)
                .collect(Collectors.toList());
        System.out.println("map提取id：" + idList);

        // 3.distinct去重（依赖equals，此处对象未重写equals，引用相同才去重）
        List<User> distinctList = userList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinct去重后：" + distinctList);

        // 4.sorted排序：按年龄升序、降序
        List<User> sortAsc = userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println("sorted年龄升序：" + sortAsc);

        List<User> sortDesc = userList.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println("sorted年龄降序：" + sortDesc);

        // 5.skip + limit 分页：跳过2条，取3条
        List<User> pageList = userList.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("skip+limit分页(跳过2取3)：" + pageList);

        // collect各种收集器
        // 转Set
        Set<User> userSet = userList.stream().collect(Collectors.toSet());
        // 转Map key=id value=对象
        Map<Integer, User> userMap = userList.stream()
                .distinct()
                .collect(Collectors.toMap(User::getId, x -> x));
        System.out.println("toMap：" + userMap);

        // joining拼接用户名
        String nameJoin = userList.stream()
                .map(User::getName)
                .collect(Collectors.joining(","));
        System.out.println("joining拼接名字：" + nameJoin);

        // groupingBy分组：按性别分组 Map<性别,List<User>>
        Map<String, List<User>> sexGroup = userList.stream()
                .collect(Collectors.groupingBy(User::getSex));
        System.out.println("groupingBy按性别分组：" + sexGroup);

        // partitioningBy分区：成年人true /未成年人false两组
        Map<Boolean, List<User>> agePartition = userList.stream()
                .collect(Collectors.partitioningBy(u -> u.getAge() > 18));
        System.out.println("partitioningBy按成年分区：" + agePartition);
    }
}