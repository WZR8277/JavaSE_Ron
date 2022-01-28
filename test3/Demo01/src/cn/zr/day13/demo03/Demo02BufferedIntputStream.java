package cn.zr.day13.demo03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedIntputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/loganlee/Desktop/prop.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] btes = new byte[1024];
        int len = 0 ;
        while ((len=bis.read(btes))!=-1){
            System.out.println(new String(btes,0,len));
        }
        bis.close();
    }
}
