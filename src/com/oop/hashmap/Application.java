package com.oop.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        HashMap<HuaYin,String> hashMap = new HashMap<>();
        HuaYin p1 = new HuaYin("党玺",23);
        HuaYin p2 = new HuaYin("孙嘉旭",21);
        HuaYin p3 = new HuaYin("李亮",22);
        HuaYin p4 = new HuaYin("张之路",20);
        hashMap.put(p1,"傻");
        hashMap.put(p2,"der");
        hashMap.put(p3,"憨");
        hashMap.put(p4,"帅");
        System.out.println(hashMap.toString());
        //遍历
        System.out.println("=============keyset()============");
        for(HuaYin key: hashMap.keySet()){
            System.out.println(key+"-------------"+hashMap.get(key));
        }
        System.out.println("============entry===============");
        for(Map.Entry<HuaYin,String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+"-----------"+entry.getValue());
        }
    }
}
