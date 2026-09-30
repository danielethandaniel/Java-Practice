package java_20260819;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class file {
    //    file 对象表示一个路径，可以是文件也是文件夹，允许不存在

    public static void main(String[] args) throws IOException {
//    1.根据字符串表示的路径变成file对象,可以调用方法，把字符串转换为真实路径
        String str = "D:\\IDEA\\project\\java\\src\\java_20260819\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        /*  2.父路径 D:\IDEA\project\java\src\java_20260819\
        子路径   a.txt*/
        String parent = "D:\\IDEA\\project\\java\\src\\java_20260819\\";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

//        3.把File路径和String路径拼接
        File parents = new File("D:\\IDEA\\project\\java\\src\\java_20260819\\");
        String chilld = "a.txt";
        File f3 = new File(parents, chilld);


//        方法
        File f4 = new File("D:\\IDEA\\project\\java\\src\\java_20260819");
        File f5 = new File("D:\\IDEA\\project\\java\\src\\java_20260819\\file.java");

        System.out.println(f4.isDirectory());
        System.out.println(f4.isFile());
        System.out.println(f4.exists());


//      只能获取文件大小,单位是字节,文件夹返回0
        long length = f4.length();
        System.out.println(length);
        long len = f5.length();
        System.out.println(len);

        String absolutePath = f5.getAbsolutePath();
        System.out.println(absolutePath);

        String name = f5.getName();
        System.out.println(name);

        long l = f5.lastModified();
        System.out.println(l);


//        如何把时间毫秒值变成 yyyy年MM月dd日 HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String timeStr = sdf.format(l);
        System.out.println(timeStr);


//        文件创建和删除
        File ff1 = new File("D:\\IDEA\\project\\java\\src\\java_20260819\\a.txt");
//        父级路径不存在,报IO异常
//        createnewFile创建的一定是文件,如果路径中不包含文件名,则创建一个没有后缀的文件
        boolean newFile = ff1.createNewFile();
        System.out.println(newFile);


//        2.mkdirs         make directory
//        (1)windows路径唯一,mkdir只能创建单级,mkdirs多级,用mkdirs就好
        File ff2 = new File("D:\\IDEA\\project\\java\\src\\java_20260819\\bbb");
        boolean mkdir = ff2.mkdir();
        System.out.println(mkdir);

        boolean delete = ff2.delete();
        System.out.println(delete);


//        file获取并遍历文件夹
        File dir = new File("D:\\IDEA\\project\\java\\src\\java_20260819");

        // list() 返回字符串数组：只获取子项名字
        String[] nameArr = dir.list();
        if (nameArr != null) {
            for (String itemName : nameArr) {
                System.out.println("子项名称：" + itemName);
            }
        }

        System.out.println("===== listFiles() 遍历（推荐） =====");
        File[] files = dir.listFiles();
        // ⚠️一定要判断不为null
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("[文件] " + file.getName() + " |大小：" + file.length() + "字节");
                } else if (file.isDirectory()) {
                    System.out.println("[文件夹] " + file.getName());
                }
            }
        } else {
            System.out.println("路径不存在或者不是文件夹");
        }

    }
}
