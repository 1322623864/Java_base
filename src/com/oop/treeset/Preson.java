package com.oop.treeset;

//public class Preson implements Comparable<Preson>{
//使用Comparable接口
public class Preson {
    private String name;
    private int age;
    public Preson(){

    }

    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Preson o) {
//        int n1=this.getName().compareTo(o.getName());
//        int n2 = this.age - o.getAge();
//        return n1==0?n2:n1;
//    }
}
