package java_20260819.io;

import java.io.*;

public class IOUtil {

    /**
     * 字节流复制文件
     *
     * @param srcPath  源文件路径
     * @param destPath 目标文件路径
     * @throws IOException IO异常
     */
    public static void copyFileByByte(String srcPath, String destPath) throws IOException {
        // try‑with‑resources，执行完自动关闭流，不用手动close
        try (FileInputStream fis = new FileInputStream(srcPath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[1024]; // 缓冲区1KB
            int len;
            // read返回读到字节数，-1代表读到末尾
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        }
    }

    /**
     * 字符流读取文本文件全部内容
     *
     * @param filePath 文件路径
     * @return 文件字符串
     * @throws IOException
     */
    public static String readTextFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(filePath)) {
            char[] buf = new char[512];
            int len;
            while ((len = fr.read(buf)) != -1) {
                sb.append(buf, 0, len);
            }
        }
        return sb.toString();
    }

    /**
     * 字符流写入文本
     *
     * @param filePath 输出文件
     * @param content  写入内容
     * @param append   true追加,false覆盖
     * @throws IOException
     */
    public static void writeTextFile(String filePath, String content, boolean append) throws IOException {
        try (FileWriter fw = new FileWriter(filePath, append)) {
            fw.write(content);
        }
    }
}