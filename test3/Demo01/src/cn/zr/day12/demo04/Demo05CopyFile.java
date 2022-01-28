package cn.zr.day12.demo04;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05CopyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis= new FileInputStream("/Users/loganlee/Desktop/桌面整理/" +
                "WechatIMG46.jpeg");
        FileOutputStream fos= new FileOutputStream("/Users/loganlee/Desktop/copy.jpeg");

//        int len =0 ;
//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }//效率太低
        long s = System.currentTimeMillis();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        long e = System.currentTimeMillis();
        System.out.println(e-s);

        fos.close();
        fis.close();
    }
}
