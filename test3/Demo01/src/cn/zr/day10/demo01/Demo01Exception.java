package cn.zr.day10.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//error必须修改代码
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date data = null;
        try {
            data = sdf.parse("2000-07.19");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(data);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("后续代码");//try catch可以继续执行

        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
