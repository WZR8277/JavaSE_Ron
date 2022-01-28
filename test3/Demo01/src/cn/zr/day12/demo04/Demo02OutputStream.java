package cn.zr.day12.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/loganlee/Desktop/b.txt");
        byte[] btes = {-65,-66,67,68};//字节是负数 和后一个字节组合查询中文码表
        fos.write(btes);
        fos.write(btes,2,2);
        fos.write("你好".getBytes());
        fos.close();
    }
}
