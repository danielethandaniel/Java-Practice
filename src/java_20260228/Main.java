package java_20260228;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文本");
        int i = sc.nextInt();
        System.out.println(i);
        String name = "黑马";
        char sex = '男';
        double tall = 180.1;
        boolean love = false;
        System.out.printf("%-8s%s%n", "年龄" , name);
        System.out.println("性别" + sex);
        System.out.println("身高" + tall);
        System.out.println("婚恋情况" + love);
        System.out.printf("tom"  +  "\t\t"  +  "22"+"\n");
        System.out.printf("tommy" +  "\t" +  "22");
    }
}