package java_20260818_Exception;

public class java_20260818_Exception {
    static int[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
//        try {
//            System.out.println(arr[5]);
//        } catch (Exception e) {
//            System.out.println("数组越界异常");
//        }
//        System.out.println("程序继续执行");


//    问题1：如果try中没有遇到问题，怎么执行？
//        会把try执行完毕，不会执行catch
//                只有出现了异常才执行catch
//        try {
//            System.out.println(arr[0]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("是否执行");
//        }


/*    问题2：如果try中遇到多个问题，怎么执行？
        写多个catch对应，父类异常写在最下面
        进入 try，执行 System.out.println(arr[10]);
        发生 ArrayIndexOutOfBoundsException 数组索引越界异常
        try 块立刻终止，后面的 System.out.println(2 / 0); 不会执行
        匹配第一个 catch：java.lang.ArrayIndexOutOfBoundsException，打印：索引越界
        catch 执行完成，跳出 try‑catch 结构，继续执行后面普通代码
        输出：是否执行*/
/*        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } catch (ArithmeticException e) {
            System.out.println("除数不为0");
        }
        System.out.println("是否执行");*/
//    问题3：如果try中问题没有被捕获，怎么执行？
//        try...catch白写了，给jvm处理
/*        try {
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println("aaa");*/
//    问题4：如果try中遇到问题，try下面代码还会执行吗？
/*        不会执行，直接跳转到catch
                如果没有对应的catch，交给jvm*/
/*        try {
            System.out.println(arr[10]);
            System.out.println("aaa");
        } catch (Exception e) {
            System.out.println("索引越界");
        }
        System.out.println("bbb");*/
//ctrl+alt+t 包裹代码块
      /*  try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}