package cn.zr.day13.demo04;

import java.io.*;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois= new ObjectInputStream(
                new FileInputStream("/Users/loganlee/Desktop/prop.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
