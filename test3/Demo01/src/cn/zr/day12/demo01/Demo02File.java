package cn.zr.day12.demo01;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
//        show02("//Users//loganlee//Desktop" ,
//                "//java projs//test3//Demo01//src//cn//zr//day12//a.txt");
        show03();
    }

    private static void show03() {//可以对parent使用file的方法
        File parent = new File("//Users//loganlee//Desktop");
        File file = new File(parent,"//java projs//test3//Demo01//src//cn//zr//day12//a.txt");
        System.out.println(file);
    }

    private static void show02(String parent,String child) {
        File f1 = new File(parent,child);
        System.out.println(f1);
    }

    private static void show01() {
        File f1 = new File("//Users//loganlee//Desktop" +
                "//java projs//test3//Demo01//src//cn//zr//day12//a.txt");
        System.out.println(f1);
        File f2 = new File("b.txt");
        System.out.println(f2);
    }
}
