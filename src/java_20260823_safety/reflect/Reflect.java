package java_20260823_safety.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {
    //main入口
    public static void main(String[] args) throws Exception {
        Class<ReflectTarget> clazz = ReflectTarget.class;

        System.out.println("=====1. public有参构造实例化=====");
        Constructor<ReflectTarget> publicCon = clazz.getConstructor(String.class, Integer.class);
        ReflectTarget obj1 = publicCon.newInstance("小明", 20);
        System.out.println(obj1);

        System.out.println("\n=====2. 私有无参构造实例化=====");
        Constructor<ReflectTarget> privateCon = clazz.getDeclaredConstructor();
        privateCon.setAccessible(true);
        ReflectTarget obj2 = privateCon.newInstance();
        System.out.println(obj2);

        System.out.println("\n=====3.反射操作成员变量=====");
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj2, "小李");
        System.out.println("反射读取私有name：" + nameField.get(obj2));

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj2, 25);
        System.out.println("反射读取私有age：" + ageField.get(obj2));

        Field remarkField = clazz.getField("remark");
        remarkField.set(obj2, "反射修改备注");
        System.out.println(obj2);

        System.out.println("\n=====4.调用public普通方法=====");
        Method showInfoMethod = clazz.getMethod("showInfo", String.class);
        showInfoMethod.invoke(obj2, "调用public方法");

        System.out.println("\n=====5.调用私有方法=====");
        Method privateMethod = clazz.getDeclaredMethod("privateBusiness", String.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj2, "反射执行私有业务逻辑");

        System.out.println("\n=====6.调用静态方法=====");
        Method staticMethod = clazz.getMethod("staticFunc", String.class);
        staticMethod.invoke(null, "静态方法反射调用");

        System.out.println("\n=====Class常用API=====");
        System.out.println("全限定类名：" + clazz.getName());
        System.out.println("简单类名：" + clazz.getSimpleName());
        System.out.println("父类：" + clazz.getSuperclass());
    }

    // --------内部实体类----------
    private static class ReflectTarget {
        public String remark;
        private String name;
        private Integer age;

        //私有无参构造
        private ReflectTarget() {
            System.out.println("【私有无参构造执行】");
        }

        //public有参构造
        public ReflectTarget(String name, Integer age) {
            this.name = name;
            this.age = age;
            System.out.println("【public有参构造执行】name=" + name + ",age=" + age);
        }

        public static void staticFunc(String text) {
            System.out.println("静态方法staticFunc执行：" + text);
        }

        public void showInfo(String msg) {
            System.out.println("public方法showInfo执行，msg=" + msg + " | name=" + name + ",age=" + age);
        }

        private void privateBusiness(String content) {
            System.out.println("私有方法privateBusiness执行：" + content);
        }

        @Override
        public String toString() {
            return "ReflectTarget{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", remark='" + remark + '\'' +
                    '}';
        }
    }
}
