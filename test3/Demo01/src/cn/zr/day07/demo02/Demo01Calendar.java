package cn.zr.day07.demo02;

import java.util.Calendar;
import java.util.Date;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        c.set(Calendar.YEAR,2088);

        year = c.get(Calendar.YEAR);
        System.out.println(year);

        c.add(Calendar.YEAR,-8);
        year = c.get(Calendar.YEAR);
        System.out.println(year);

        Date date = c.getTime();
        System.out.println(date);
    }
}
