package java_20260823_safety.reflect;

import java.lang.reflect.Field;

public class MyReflrct {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        1.全类名：包名+类名
//        常用
        Class aClass = Class.forName("java_20260823_safety.reflect.Student");

//        2.类名.class
//        当作参数传递
        Class bClass = Student.class;

//        3.对象.getClass
//        当已经有了类的对象时
        Student s = new Student();
        Class cClass = s.getClass();
        Class clazz = s.getClass();

        System.out.println(aClass);

        // 获取public字段（父类public也获取）
        Field[] fields = clazz.getFields();
        System.out.println("====getFields() 获取public字段====");
        for (Field f : fields) {
            System.out.println(f);
        }

// 获取指定public字段
        Field nameField = clazz.getField("name");

// 获取本类所有字段，private/protected都拿，不拿父类
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("\n====getDeclaredFields()本类全部字段====");
        for (Field f : declaredFields) {
            System.out.println(f);
        }

// 获取本类指定任意权限字段
        Field ageField = clazz.getDeclaredField("age");

// 暴力访问私有字段，关闭权限检查
        ageField.setAccessible(true);

        // ==========下面新增：通过Field做取值、赋值==========
        // 给对象s的name赋值（public）
        nameField.set(s, "张三");
        // 给对象s的私有age赋值
        ageField.set(s, 22);

        // 获取字段的值
        Object nameVal = nameField.get(s);
        Object ageVal = ageField.get(s);

        System.out.println("\n反射赋值后读取：");
        System.out.println("name = " + nameVal);
        System.out.println("age = " + ageVal);

        // 获取字段类型
        System.out.println("\nage字段类型：" + ageField.getType());
        System.out.println("name字段类型：" + nameField.getType());

    }
}


