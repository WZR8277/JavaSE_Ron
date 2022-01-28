package cn.zr.day12.demo01;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("c.txt");
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        File f2 = new File("a.txt");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
        File f3 = new File("/Users/loganlee/Desktop/桌面整理");
        if(f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }
    }

    private static void show01() {
        File f1 = new File("a.txt");
        System.out.println(f1.exists());

        File f2 = new File("/Users/loganlee/Desktop/桌面整理/WechatIMG46.jpeg");
        System.out.println(f2.exists());
    }
}
