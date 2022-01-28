package cn.zr.day07.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        deme01();
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2021年12月05日 15时25分08秒");
        System.out.println(date);
    }

    private static void deme01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}

