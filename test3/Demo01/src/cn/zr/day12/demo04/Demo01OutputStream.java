package cn.zr.day12.demo04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/loganlee/Desktop/a.txt");
        fos.write(97);
        fos.close();
    }
}
