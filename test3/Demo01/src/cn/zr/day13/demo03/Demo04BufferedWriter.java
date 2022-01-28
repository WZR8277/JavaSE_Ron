package cn.zr.day13.demo03;

import java.io.*;

public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/loganlee/Desktop/prop.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i <10; i++) {
            bw.write("Ron");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
