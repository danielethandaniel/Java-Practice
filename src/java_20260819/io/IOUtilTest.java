package java_20260819.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class IOUtilTest {
    private final File tempDir = new File("./io_test_temp");
    private File sourceFile;
    private File targetCopyFile;

    /**
     * 每个测试方法执行前的初始化：
     * 创建临时目录，准备源文件和目标文件，并写入测试内容
     */
    @BeforeEach
    void setUp() throws IOException {
        //每个测试前创建临时目录
        tempDir.mkdirs();
        sourceFile = new File(tempDir, "source.txt");
        targetCopyFile = new File(tempDir, "copy.txt");
        //写入测试原始内容
        IOUtil.writeTextFile(sourceFile.getAbsolutePath(), "hello io 你好", false);
    }

    /**
     * 每个测试方法执行后的清理：
     * 递归删除临时目录及其中的所有文件
     */
    @AfterEach
    void tearDown() {
        //测试结束递归删除临时文件夹
        deleteRecursive(tempDir);
    }

    /**
     * 递归删除文件或目录
     *
     * @param file 要删除的文件或目录
     */
    private void deleteRecursive(File file) {
        if (!file.exists()) return;
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteRecursive(child);
                }
            }
        }
        file.delete();
    }


    /**
     * 测试字符流读取文本文件：
     * 验证读取的内容与写入的内容一致
     */
    @Test
    void testReadTextFile() throws IOException {
        String content = IOUtil.readTextFile(sourceFile.getAbsolutePath());
        Assertions.assertEquals("hello io 你好", content);
    }

    /**
     * 测试字符流覆盖写入：
     * 以覆盖模式写入新内容，验证文件内容已被完全替换
     */
    @Test
    void testWriteTextOverwrite() throws IOException {
        IOUtil.writeTextFile(sourceFile.getAbsolutePath(), "新内容", false);
        String res = IOUtil.readTextFile(sourceFile.getAbsolutePath());
        Assertions.assertEquals("新内容", res);
    }

    /**
     * 测试字符流追加写入：
     * 以追加模式写入内容，验证新内容拼接在原内容之后
     */
    @Test
    void testWriteTextAppend() throws IOException {
        IOUtil.writeTextFile(sourceFile.getAbsolutePath(), "追加", true);
        String res = IOUtil.readTextFile(sourceFile.getAbsolutePath());
        Assertions.assertEquals("hello io 你好追加", res);
    }

    /**
     * 测试字节流复制文件：
     * 将源文件复制到目标文件，验证目标文件存在且内容与源文件一致
     */
    @Test
    void testCopyFileByByte() throws IOException {
        IOUtil.copyFileByByte(sourceFile.getAbsolutePath(), targetCopyFile.getAbsolutePath());
        //校验复制后文件存在，内容一致
        Assertions.assertTrue(targetCopyFile.exists());
        String origin = IOUtil.readTextFile(sourceFile.getAbsolutePath());
        String copyContent = IOUtil.readTextFile(targetCopyFile.getAbsolutePath());
        Assertions.assertEquals(origin, copyContent);
    }
}