package com.oop.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("刘谦",36);
        Student s3 = new Student("郭艾伦",32);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.remove(s3);
        System.out.println(collection);
        System.out.println("---------------------");
        Iterator it = collection.iterator();
        while(it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s);
            System.out.println("-------------------");
            for (Object o : collection) {
                Student ss = (Student)o;
                System.out.println(ss);
            }
        }



    }
}
