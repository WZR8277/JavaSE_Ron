package cn.zr.day12.demo01;

import java.io.File;
import java.io.IOException;

public class Demo03File {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }

    private static void show04() {
        File f1 = new File("/Users/loganlee/Desktop/桌面整理/WechatIMG46.jpeg");
        long length = f1.length();
        System.out.println(length);//1121164

        File f2 = new File("a.txt");//0?????? 解决 放在test3下就可以
        System.out.println(f2.length());
    }

    private static void show03() {
        File f1 = new File("//Users//loganlee//Desktop" +
                "//java projs//test3//a.txt");
        System.out.println(f1.getName());
        File f2 = new File("//Users//loganlee//Desktop" +
                "//java projs//test3");
        System.out.println(f2.getName());
    }

    private static void show02() {
        File f1 = new File("//Users//loganlee//Desktop" +
                "//java projs//test3//a.txt");
        File f2 = new File("b.txt");
        System.out.println(f1.getPath());
        System.out.println(f1.toString());//toString就是调用getPath
        System.out.println(f2.getPath());
    }

    private static void show01() {
        File f1 = new File("//Users//loganlee//Desktop" +
                "//java projs//test3//a.txt");
        try {
            System.out.println(f1.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f2 = new File("b.txt");
        System.out.println(f2.getAbsolutePath());
    }
}
