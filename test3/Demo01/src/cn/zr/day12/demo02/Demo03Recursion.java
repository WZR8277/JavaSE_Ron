package cn.zr.day12.demo02;

import java.io.File;
import java.io.IOException;

public class Demo03Recursion {
    public static void main(String[] args) {

//        File f1 = new File("abc//a");
//        boolean mkdir1 = f1.mkdirs();
//        System.out.println(mkdir1);
//
//        File f2 = new File("abc//b");
//        boolean mkdir2 = f2.mkdirs();
//        System.out.println(mkdir2);
//
//        File f3 = new File("abc//abc.txt");
//        try {
//            boolean newFile = f3.createNewFile();
//            System.out.println(newFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File f4 = new File("abc//abc.java");
//        try {
//            boolean newFile = f4.createNewFile();
//            System.out.println(newFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File f1 = new File("abc");
        getAllFile(f1);
    }

    private static void getAllFile(File dir) {

        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            } else{
            System.out.println(file);
            }
        }
    }
}
