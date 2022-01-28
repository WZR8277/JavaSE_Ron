package cn.zr.day13.demo03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/loganlee/Desktop/prop.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入内部缓冲区".getBytes());
        bos.flush();
    }
}
