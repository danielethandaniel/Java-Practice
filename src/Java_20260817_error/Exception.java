package Java_20260817_error;

import java.io.FileReader;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {

        // ===== 1. try-catch-finally 基本用法 =====
        System.out.println("===== 1. try-catch-finally =====");
        try {
            int result = 10 / 0;
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获异常: " + e.getMessage());
        } finally {
            // finally 无论是否发生异常都会执行，常用于释放资源
            System.out.println("finally 执行（一定会执行）");
        }

        // ===== 2. 多个 catch =====
        System.out.println("\n===== 2. 多个 catch =====");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
            String str = null;
            str.length();
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("数组越界: " + e1.getMessage());
        } catch (NullPointerException e2) {
            System.out.println("空指针: " + e2.getMessage());
        } catch (java.lang.Exception e3) {
            // 最大的异常放最后
            System.out.println("其他异常: " + e3.getMessage());
        }

        // ===== 3. throws 声明异常，交给调用方处理 =====
        System.out.println("\n===== 3. throws =====");
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("读取文件失败: " + e.getMessage());
        }

        // ===== 4. throw 手动抛出异常 =====
        System.out.println("\n===== 4. throw =====");
        try {
            setAge(200);
        } catch (java.lang.Exception e) {
            System.out.println("设置年龄失败: " + e.getMessage());
        }

        // ===== 5. 自定义异常 =====
        System.out.println("\n===== 5. 自定义异常 =====");
        try {
            checkScore(150);
        } catch (ScoreException e) {
            System.out.println("分数异常: " + e.getMessage());
        }
    }

    // ===== throws: 方法声明抛出受检异常，调用方必须处理 =====
    public static void readFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        int ch = fr.read();
        System.out.println("读取内容: " + (char) ch);
        fr.close();
    }

    // ===== throw: 方法内部手动抛出异常 =====
    public static void setAge(int age) throws java.lang.Exception {
        if (age < 0 || age > 150) {
            throw new java.lang.Exception("年龄不合法: " + age);
        }
        System.out.println("年龄设置成功: " + age);
    }

    // ===== 自定义异常示例 =====
    public static void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("分数不合法: " + score);
        }
        System.out.println("分数合法: " + score);
    }
}

// ===== 自定义异常类：继承 Exception（受检异常）或 RuntimeException（非受检异常） =====
class ScoreException extends java.lang.Exception {
    public ScoreException(String message) {
        super(message);
    }
}
