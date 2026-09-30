package Java_20260929_MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDeom3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无级", "周正若", "赵敏", "张三丰");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无级", "周正若", "赵敏", "张三丰");
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张") && s.length() == 3;
                    }
                })
                .forEach(s -> System.out.println(s));


        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张无级", "周正若", "赵敏", "张三丰");
        list.stream()
                .filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.println(s));


        list.stream()
                .filter(this::stringJudge)
                .forEach(s -> System.out.println(s));
    }


    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }

}
