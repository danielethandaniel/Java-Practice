package java_20260331;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        // 1. 获取这个类的“档案/字节码”
        Class<?> clazz = Class.forName("java_20260331.Programmer");

        // 2. 反射自动 new 对象（不写 new！偷偷造出来）
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 3. 反射找到 setName 方法
        java.lang.reflect.Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);

        // 4. 反射调用方法，给对象赋值
        setNameMethod.invoke(obj, "张三");

        // 5. 强转一下，调用work
        Programmer p = (Programmer) obj;
        p.work();
    }
}

