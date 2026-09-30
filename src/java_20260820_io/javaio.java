package java_20260820_io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class javaio {
//    io:存储和读取数据的方法（存档）         file：不能读取数据
//    读写：以程序为参照物往文件中读写

    //    1.字节流  InputStream OutputStream
    //    写成一段文字到本地文件中
    @Test
    void output() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
        fos.write(97);
        fos.close();
    }

    @Test
    void output2() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
/*        fos.write(97);
        fos.write(98);*/

        byte[] bytes = {97, 98, 99, 100, 101};
//        fos.write(bytes);

        fos.write(bytes, 1, 2);


        fos.close();
    }

    @Test
    void Continuation() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
        String str1 = "qwertyuiop";
        String str2 = "qwertyuiop";
        String wrap = "\r\n";

        fos.write(str1.getBytes());
        System.out.println(Arrays.toString(str1.getBytes()));

        fos.write(wrap.getBytes());
        fos.write(str2.getBytes());
        fos.close();
    }

    @Test
    void input() throws IOException {
        FileInputStream fos = new FileInputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
        int b1 = fos.read();
        System.out.println(b1);
        fos.close();
    }

    @Test
    void input1() throws IOException {
        FileInputStream fos = new FileInputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
        int b1;
       /* while ((b1 = fos.read()) != -1){
            System.out.print((char) b1);
        }*/
        while ((b1 = fos.read()) != -1) {
            System.out.print((char) b1);
        }
        fos.close();
    }

    @Test
    void movie() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\b.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\copy.mp4");

//        一次读取一个字节
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

//      先开的流后关闭
        fos.close();
        fis.close();
    }

    @Test
    void readmore() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\a.txt");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
//        返回值：一次读取多少字节数据
        System.out.println(len);
        String str = new String(bytes);
        System.out.println(str);
//        多次读取覆盖
        fis.close();
    }

    @Test
    void movie2() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\b.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\IDEA\\project\\java\\src\\java_20260820_io\\copy2.mp4");

        byte[] bytes = new byte[1024 * 1024 * 5];
        int b;
        while ((b = fis.read()) != -1) {
//            上面读取多少就写入多少，从0索引到b
            fos.write(bytes, 0, b);
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


}
