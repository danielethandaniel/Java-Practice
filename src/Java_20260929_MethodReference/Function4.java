package Java_20260929_MethodReference;

import java.util.ArrayList;

public class Function4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhangsan", 24));
        list.add(new Student("zhangsan", 24));
        list.add(new Student("zhangsan", 24));

/*        list.stream().map(new  Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);*/


        list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(list);
       /* list.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                }).forEach(System.out::println);


        list.stream().map(String::toUpperCase).forEach(System.out::println);*/

//        list.stream().map(Student::new).forEach(System.out::println);
    }
}
