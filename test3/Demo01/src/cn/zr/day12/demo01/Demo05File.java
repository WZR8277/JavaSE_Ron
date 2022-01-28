package cn.zr.day12.demo01;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
    }

    private static void show03() {
        File f1 = new File("新建单级文件夹");//文件夹有内容也不会删除
        boolean del = f1.delete();
        System.out.println(del);
    }

    private static void show02() {
        File f1 = new File("新建单级文件夹");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

        File f2 = new File("新建多级文件夹1//新建多级文件夹2");
        boolean mkdir2 = f2.mkdirs();
        System.out.println(mkdir2);
    }

    private static void show01() {
        File f1 = new File("c.txt");
        try {
            boolean newFile = f1.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
