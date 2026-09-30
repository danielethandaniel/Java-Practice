package java_20260819.Junit5;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    /**
     * 创建新文件
     *
     * @param filePath 文件路径
     * @return true 创建成功；false 文件已存在
     * @throws IOException 父目录不存在抛出异常
     */
    public static boolean createNewFile(String filePath) throws IOException {
        File file = new File(filePath);
        return file.createNewFile();
    }

    /**
     * 创建多级文件夹
     *
     * @param dirPath 文件夹路径
     * @return 是否创建成功
     */
    public static boolean createDirs(String dirPath) {
        File dir = new File(dirPath);
        return dir.mkdirs();
    }

    /**
     * 删除文件或者空文件夹
     */
    public static boolean deleteFileOrDir(String path) {
        File file = new File(path);
        return file.delete();
    }

    /**
     * 判断是否是文件
     */
    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }

    /**
     * 判断是否文件夹
     */
    public static boolean isDirectory(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    /**
     * 获取文件字节大小
     */
    public static long getFileLength(String path) {
        File file = new File(path);
        return file.length();
    }
}