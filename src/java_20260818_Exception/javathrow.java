package java_20260818_Exception;

public class javathrow {
/*    throws 方法定义处，告诉调用者可能出现哪些异常
    编译时异常：必须写  运行时异常：可以不写*/

//    throw 写在方法内，结束方法手动抛出异常，方法中下面的代码不执行

    public static void main(String[] args) {
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
//            手动创建异常对象，把异常交给方法调用者处理
//            下面代码不会在执行
            throw new NullPointerException();
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("aaa");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
