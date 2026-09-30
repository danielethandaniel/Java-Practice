//package Java_20260817_error;
//
//public class error {
//    public class ExceptionTest {
//        public static void main(String[] args) {
//            System.out.println("=====1.运行时异常捕获测试=====");
//            testRuntimeException();
//
//            System.out.println("\n=====2.多catch顺序测试=====");
//            testMultiCatch();
//
//            System.out.println("\n=====3.finally测试，含return坑=====");
//            int res = testFinallyReturn();
//            System.out.println("testFinallyReturn返回值：" + res);
//
//            System.out.println("\n=====4.throws向上抛出，调用方捕获=====");
//            try {
//                testThrowsMethod();
//            } catch (Exception e) {
//                System.out.println("main捕获异常：" + e.getMessage());
//            }
//
//            System.out.println("\n=====5.throw手动抛出自定义业务异常=====");
//            try {
//                checkAge(-5);
//            } catch (BizException e) {
//                System.out.println("捕获自定义异常：" + e.getMessage());
//                e.printStackTrace();
//            }
//
//            System.out.println("\n=====6.try‑with‑resources自动关闭资源=====");
//            testTryWithResources();
//        }
//
//        // 1.算术运行时异常
//        public static void testRuntimeException() {
//            try {
//                int i = 1 / 0;
//            } catch (ArithmeticException e) {
//                System.out.println("捕获除零异常：" + e.getMessage());
//                //e.printStackTrace();
//            } finally {
//                System.out.println("testRuntimeException的finally执行");
//            }
//        }
//
//        // 2.多catch：子类放前面，父类Exception放最后
//        public static void testMultiCatch() {
//            Object obj = null;
//            try {
//                obj.toString();
//            } catch (NullPointerException e) {
//                System.out.println("捕获空指针");
//            } catch (Exception e) {
//                System.out.println("捕获通用异常");
//            }
//        }
//
//        // 3.finally return坑，禁止业务这样写
//        public static int testFinallyReturn() {
//            try {
//                return 100;
//            } finally {
//                // finally的return会覆盖try的return
//                return 200;
//            }
//        }
//
//        //4. throws声明抛出受检异常，交给调用者处理
//        public static void testThrowsMethod() throws Exception {
//            throw new Exception("testThrowsMethod抛出受检异常");
//        }
//
//        //5. throw主动抛自定义运行时业务异常
//        public static void checkAge(int age) {
//            if (age < 0) {
//                throw new BizException("年龄不能小于0，传入age=" + age);
//            }
//            System.out.println("合法年龄：" + age);
//        }
//
//        //6. try‑with‑resources 自动关闭实现AutoCloseable的资源
//        public static void testTryWithResources() {
//            //自定义模拟IO资源
//            try (MyResource resource = new MyResource()) {
//                resource.doWork();
//            } catch (Exception e) {
//                System.out.println("资源操作异常：" + e.getMessage());
//            }
//        }
//
//        //        读取文件时，如果发生异常，可以抛出IOException（1/0），交给调用方处理
//        class MyResource {
//            public void doWork() throws Exception {
//                System.out.println("执行资源业务操作");
//                throw new Exception("模拟读取文件失败");
//            }
//
//            @Override
//            public void close() throws Exception {
//                System.out.println("MyResource资源自动关闭执行");
//                throw new Exception("模拟资源关闭失败");
//            }
//        }
//
//
//    }
//
//    //自定义业务运行时异常，项目最常用
//    class BizException extends RuntimeException {
//        public BizException(String message) {
//            super(message);
//        }
//    }
//
//    //模拟IO资源，实现AutoCloseable接口，支持try‑with‑resources
//    class MyResource implements AutoCloseable {
//        public void doWork() throws Exception {
//            System.out.println("执行资源业务操作");
//            //throw new Exception("模拟读取文件失败");
//        }
//
//        @Override
//        public void close() {
//            System.out.println("MyResource资源自动关闭执行");
//        }
//    }
//}
