package cn.zr.day13.demo03;

import java.io.*;

public class Demo06OutputStreamWriterAndReader {
    public static void main(String[] args) throws IOException {
//        write_utf_8();
//        write_gbk();
        read_utf_8();
//        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("/Users/loganlee/Desktop/prop_gbk.txt"),"gbk");
        int len=0;
        while ((len=inputStreamReader.read())!=-1){
            System.out.println((char) len);
        }
        inputStreamReader.close();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("/Users/loganlee/Desktop/prop.txt"),"utf-8");
        int len=0;
        while ((len=inputStreamReader.read())!=-1){
            System.out.println((char) len);
        }
        inputStreamReader.close();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter outputStreamWriter =
                new OutputStreamWriter(new FileOutputStream("/Users/loganlee/Desktop/prop_gbk.txt")
                        ,"GBK");
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter outputStreamWriter =
                new OutputStreamWriter(new FileOutputStream("/Users/loganlee/Desktop/prop.txt")
                        ,"utf-8");
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
