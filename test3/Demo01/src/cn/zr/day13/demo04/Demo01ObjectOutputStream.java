package cn.zr.day13.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("/Users/loganlee/Desktop/prop.txt"));
        objectOutputStream.writeObject(new Person("Ron",21));
        objectOutputStream.close();
    }
}
