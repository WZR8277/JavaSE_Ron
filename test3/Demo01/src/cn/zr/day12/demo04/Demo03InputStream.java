package cn.zr.day12.demo04;

import java.io.FileInputStream;

import java.io.IOException;

public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/loganlee/Desktop/c.txt");
        int len = 0;
        while ((len= fis.read())!=-1){//注意read每用一次就已经往后移动了
            System.out.println((char)len);
        }
        fis.close();
    }
}
