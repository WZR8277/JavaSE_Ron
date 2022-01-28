package cn.zr.day10.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

//避免finally中写return 一般用于资源释放
public class Demo08FinallyException {
    public static void main(String[] args) {
        //int a = getA();
        try {
            readFile("a.txt");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    private static int getA() {
        int a= 10;
        try {
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a=100;
            return a;
        }

    }
    private static void readFile(String fileName) throws IOException {
        if(!fileName.equals("/Users/loganlee/Downloads/cat_kind-master")){
            throw new FileNotFoundException("找不到对应文件");//编译异常必须处理
        }
        if(!fileName.endsWith("master")){
            throw new IOException("文件类型错误");
        }
        System.out.println("读取文件");
    }
}
