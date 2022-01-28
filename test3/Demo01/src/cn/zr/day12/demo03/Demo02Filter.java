package cn.zr.day12.demo03;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {

        File f1 = new File("abc");
        getAllFile(f1);
    }

    private static void getAllFile(File dir) {

        //System.out.println(dir);
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt");
//            }
//        });

//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".txt");
//            }
//        });

//        File[] files = dir.listFiles((File d,String name)->
//        {return new File(d,name).isDirectory()||name.toLowerCase().endsWith(".txt");});

        File[] files = dir.listFiles((d,name)->
        new File(d,name).isDirectory()||name.toLowerCase().endsWith(".txt"));
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            } else{
            System.out.println(file);
            }
        }
    }
}
