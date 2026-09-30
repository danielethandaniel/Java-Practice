package java_20260818_Exception;

import java.io.FileReader;
import java.io.IOException;

public class work {
    // throws IOException：声明本方法可能抛出IO异常，不自己处理，交给调用方
    public static void readFile() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("test.txt");// 文件不存在就抛IOException
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                fr.close();

            }
            System.out.println("必然执行");
        }
    }

    public static void main(String[] args) {
        try {
            // 调用readFile，就要处理它抛出来的IOException
            readFile();
        } catch (IOException e) {
            // 调用方这里处理异常
            System.out.println("读取文件发生IO异常！");
            e.printStackTrace();
        }
    }
}

