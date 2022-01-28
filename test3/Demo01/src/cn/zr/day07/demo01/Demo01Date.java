package cn.zr.day07.demo01;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        Date d1 = new Date(0L);
        System.out.println(d1);

        Date d2 = new Date(15811111111L);
        System.out.println(d2 );
    }

    private static void demo01() {
        Date data = new Date();
        System.out.println(data);
    }
}
