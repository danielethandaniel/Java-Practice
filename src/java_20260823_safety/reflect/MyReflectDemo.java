package java_20260823_safety.reflect;

import java.lang.reflect.Constructor;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("java_20260823_safety.reflect.Student");

        Constructor[] cons = aClass.getConstructors();

        for (Constructor con : cons) {
            System.out.println(con);
        }
    }
}
