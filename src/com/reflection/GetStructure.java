package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetStructure {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.User");
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        System.out.println("===============");
        Field[] fields = c1.getFields();
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        System.out.println("======================");
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的"+ method);
        }
        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("全部的"+ method);
        }
    }

}
