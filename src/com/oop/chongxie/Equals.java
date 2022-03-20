package com.oop.chongxie;

public class Equals {
     int age = 0;
    public String name = "王斌";
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(obj instanceof Equals){
            Equals s1 = (Equals) obj;
            Equals s2 = (Equals) obj;
            if(s1.name.equals(s2.name)){
                return true;
            }
        }
        return false;
    }


}
