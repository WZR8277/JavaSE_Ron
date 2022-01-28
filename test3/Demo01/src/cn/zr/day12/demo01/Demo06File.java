package cn.zr.day12.demo01;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("//Users//loganlee//Desktop//java projs");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show01() {
        File f1 = new File("//Users//loganlee//Desktop//java projs");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
