package java_20260819.Junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileUtilTest {

    // 测试使用的临时目录，不要写业务真实目录
    private final String testBase = "D:\\IDEA\\project\\java\\src\\java_20260819\\junit_test_temp";
    private File baseDir;

    // 每一个@Test运行前执行，准备环境
    @BeforeEach
    void setUp() {
        baseDir = new File(testBase);
        // 保证基础测试文件夹存在
        baseDir.mkdirs();
    }

    // 每一个@Test跑完之后执行，删除测试产生的文件
    @AfterEach
    void tearDown() {
        deleteAll(baseDir);
    }

    // 递归删除文件夹工具，delete只能删空文件夹
    private void deleteAll(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] children = file.listFiles();
                if (children != null) {
                    for (File child : children) {
                        deleteAll(child);
                    }
                }
            }
            file.delete();
        }
    }


    @Test
    void testCreateNewFile() throws IOException {
        String testFile = testBase + File.separator + "demo.txt";
        //调用业务方法
        boolean result = FileUtil.createNewFile(testFile);
        //断言：第一次创建返回true
        Assertions.assertTrue(result);

        File f = new File(testFile);
        Assertions.assertTrue(f.exists());
        Assertions.assertTrue(FileUtil.isFile(testFile));

        //再次创建同一个文件，返回false（已存在）
        boolean result2 = FileUtil.createNewFile(testFile);
        Assertions.assertFalse(result2);
    }

    @Test
    void testCreateMultiDir() {
        String multiDir = testBase + File.separator + "a\\b\\c\\d";
        boolean ok = FileUtil.createDirs(multiDir);
        Assertions.assertTrue(ok);
        Assertions.assertTrue(FileUtil.isDirectory(multiDir));
    }

    @Test
    void testDelete() throws IOException {
        String testFile = testBase + File.separator + "to_del.txt";
        FileUtil.createNewFile(testFile);
        Assertions.assertTrue(new File(testFile).exists());

        boolean delRet = FileUtil.deleteFileOrDir(testFile);
        Assertions.assertTrue(delRet);
        Assertions.assertFalse(new File(testFile).exists());
    }

    @Test
    void testFileLength() throws IOException {
        String testFile = testBase + File.separator + "size.txt";
        File file = new File(testFile);
        file.createNewFile();

        long len = FileUtil.getFileLength(testFile);
        //新建空文件字节为0
        Assertions.assertEquals(0, len);
    }

}