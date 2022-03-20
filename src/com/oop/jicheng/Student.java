package com.oop.jicheng;

public class Student extends Person{
 public String name = "zhangzhilu";

    @Override
    public void say() {
        super.say();
    }

    public void text(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
 }
}
