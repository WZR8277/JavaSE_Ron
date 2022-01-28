package cn.zr.day13.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02FlushAndClose {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/loganlee/Desktop/c.txt");

//        int len=0;
//        while ((len=fr.read())!=-1){
//            System.out.println((char) len);
//        }
        fw.write(97);
        fw.flush();//刷新后流对象可以继续使用 只刷新缓冲区
        fw.write(98);
        
        fw.close();//刷新缓冲区 流无法使用
    }
}
