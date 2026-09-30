/*
package java_20260815_object;

import java.util.Arrays;

public class lambda {
    public static void main(String[] args) {
        Integer[] arr = {2, 9, 14, 6, 8, 18};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr));


        interface Calc {
            int add(int a, int b);
        }
        class Demo {
            public static void main(String[] args) {
                //1.匿名内部类写法
                Calc c1 = new Calc() {
                    @Override
                    public int add(int a, int b) {
                        return a + b;
                    }
                };
                System.out.println(c1.add(1, 2));

                //2.Lambda写法
                Calc c2 = (a, b) -> a + b;
                System.out.println(c2.add(1, 2));
            }
        }
    }
}

*/
