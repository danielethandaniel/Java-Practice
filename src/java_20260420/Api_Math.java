package java_20260420;

import java.util.Scanner;

public class Api_Math {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(10));
//
//        //        数轴的正无穷大
//        System.out.println(Math.ceil(3.6));
//        System.out.println(Math.ceil(-3.6));
//
//        //        数轴的负无穷大
//        System.out.println(Math.floor(3.7));
//        System.out.println(Math.floor(-3.7));
//
//        System.out.println(Math.round(3.5));
//        System.out.println(Math.round(-3.5));
//
//        System.out.println(Math.max(3, 5));
//        System.out.println(Math.min(3, 5));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
