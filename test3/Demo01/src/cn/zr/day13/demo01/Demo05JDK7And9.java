package cn.zr.day13.demo01;

import java.io.*;

//此方法不用close了 try括号中流对象
public class Demo05JDK7And9 {
    public static void main(String[] args) {
        try(        FileInputStream fis= new FileInputStream("/Users/loganlee/Desktop/桌面整理/"
                +
                "WechatIMG46.jpeg");
                    FileOutputStream fos= new FileOutputStream("/Users/loganlee/Desktop/copy.jpeg");){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            methodJDK9();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void methodJDK9() throws FileNotFoundException {
        FileInputStream fis= new FileInputStream("/Users/loganlee/Desktop/桌面整理/WechatIMG46.jpeg");
        FileOutputStream fos= new FileOutputStream("/Users/loganlee/Desktop/copy.jpeg");
        try(fis;fos){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
