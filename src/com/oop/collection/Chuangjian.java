package com.oop.collection;


import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Chuangjian {
   public static void main(String[] args) {
     Collection collection = new ArrayList();
     collection.add("haha");
     collection.add("nihao");
     collection.add("qi");
      for (Object o : collection) {
         System.out.println(o);
      }
      System.out.println("----------------------------");
      Iterator it = collection.iterator();
      while(it.hasNext()){
         String s = (String)it.next();
         System.out.println(s);
      }
   }








}
