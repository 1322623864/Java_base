package com.oop.time;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        calendar.set(Calendar.YEAR,2020);
        System.out.println(calendar.getTime());
        System.out.println(year);
        System.out.println(calendar.getTime().toLocaleString());
    }
}
