package java_20260821_io;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class character {
    @Test
    void CharIO() throws IOException {
        FileReader fr = new FileReader("D:\\IDEA\\project\\java\\src\\java_20260821_io\\a.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }


    @Test
    void CharIO2() throws IOException {
        FileReader fr = new FileReader("D:\\IDEA\\project\\java\\src\\java_20260821_io\\a.txt");
        char[] chars = new char[10];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
