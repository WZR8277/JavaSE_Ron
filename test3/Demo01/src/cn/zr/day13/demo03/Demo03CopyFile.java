package cn.zr.day13.demo03;

import java.io.*;

public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis= new FileInputStream("/Users/loganlee/Desktop/桌面整理/" +
                "WechatIMG46.jpeg");
        FileOutputStream fos= new FileOutputStream("/Users/loganlee/Desktop/copy.jpeg");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long s = System.currentTimeMillis();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        long e = System.currentTimeMillis();
        System.out.println("复制文件耗时："+(e-s));

        bos.close();
        bis.close();
    }
}
