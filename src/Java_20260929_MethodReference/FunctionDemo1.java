package Java_20260929_MethodReference;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //倒序排列
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));

        //lambda
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        System.out.println(Arrays.toString(arr));
        //lambda简化
        //1.数据类型可以省略
        //2.形参只有一个，小括号可以省略
        //3.方法体只有一行大括号，return（关键字），分号可以省略
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        //方法引用
        //1.引用处必须是函数式接口
        //2.被引用的方法已经存在
        //3.被引用的方法的形参和返回值跟抽象方法一致
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
}
