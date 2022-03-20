package com.oop.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        java.util.Map<String,String> map = new HashMap<>();
        map.put("cn","中国");
        map.put("usa","美国");
        map.put("uk","英国");
        System.out.println("元素个数："+map.size());
        System.out.println(map.toString());
        //遍历
        System.out.println("=============使用keyset===========");
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println(key+"-------"+map.get(key));
        }
        System.out.println("=============使用entryset===========");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"-------"+entry.getValue());

        }
    }
}
