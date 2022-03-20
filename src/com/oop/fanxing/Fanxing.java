package com.oop.fanxing;

public class Fanxing<T> {
    T t;
    public void show(T t) {
        System.out.println(t);
    }
    public T getT(){
        return t;
    }
}


