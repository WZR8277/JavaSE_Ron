package cn.zr.day12.demo03;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {

        File f1 = new File("abc");
        getAllFile(f1);
    }

    private static void getAllFile(File dir) {

        //System.out.println(dir);
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            } else{
            System.out.println(file);
            }
        }
    }
}
