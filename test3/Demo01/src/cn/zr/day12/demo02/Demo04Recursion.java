package cn.zr.day12.demo02;

import java.io.File;
import java.util.Locale;

public class Demo04Recursion {
    public static void main(String[] args) {

        File f1 = new File("abc");
        getAllFile(f1);
    }

    private static void getAllFile(File dir) {
        
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            } else{
                String name = file.getName();
                if(name.toLowerCase().endsWith(".txt")) {
                    System.out.println(file);
                }
            }
        }
    }
}
