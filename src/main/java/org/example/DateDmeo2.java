package org.example;

import java.util.Date;
import java.util.Random;

public class DateDmeo2 {
    public static void main(String[] args) {
        extracted1();
        extracted();
    }

    private static void extracted1() {
        Random r=new Random();

        Date d1=new Date(Math.abs(r.nextInt()));
        Date d2=new Date(Math.abs(r.nextInt()));

        long time1=d1.getTime();
        long time2=d2.getTime();
        if (time1 > time2) {
            System.out.println("第一个在后面");
        }else if (time1 < time2) {
            System.out.println("第一个在前面");
        }else {
            System.out.println("一样");
        }
    }

    private static void extracted() {
        Date d1 =new Date(0L);
        long time = d1.getTime();
        time = time+1000L*60*60*24*365;
        d1.setTime(time);
        System.out.println(d1);
    }
}
