package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Createobject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.User");
//        //通过构造器创建对象
//        Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
//        User user01 = (User)constructor.newInstance("Jeffk",001,18);
//        System.out.println(user01);
//        //构建对象
//        User user = (User) c1.newInstance();//本质是调用了类的无参构造
//        System.out.println(user);

        User user = ( User)c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke() 激活的作用
        //（对象，“方法的值”）
        setName.invoke(user,"Jaffk");
        System.out.println(user.getName());

        //通过反射操作属性
        System.out.println("================================");
        User user2 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性 必须关闭安全检测
        //setAccessible true 关闭 flase 开启
        name.setAccessible(true);
        name.set(user2,"Jaffk2");
        System.out.println(user2.getName());
    }

}
