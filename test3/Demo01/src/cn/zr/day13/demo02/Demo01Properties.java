package cn.zr.day13.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();

        prop.load(new FileReader("/Users/loganlee/Desktop/prop.txt"));
        Set<String> set= prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+prop.getProperty(s));
        }
    }

    private static void show02() throws IOException {

        Properties prop = new Properties();

        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");

        FileWriter fw = new FileWriter("/Users/loganlee/Desktop/prop.txt");//可以写中文 字符流
        prop.store(fw,"save data");
        fw.close();
    }

    private static void show01() {

        Properties prop = new Properties();

        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","160");

        Set<String> set= prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
            System.out.println(prop.getProperty(s));
        }
    }
}
