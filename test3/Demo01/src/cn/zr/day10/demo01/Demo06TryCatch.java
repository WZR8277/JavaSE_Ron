package cn.zr.day10.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

//1.自己处理异常,程序可以继续执行 2.try中有多个异常多个catch去处理
public class Demo06TryCatch {
    public static void main(String[] args) {
        try{
            readFile("c");
        }catch (IOException e){
            //System.out.println("catch - 文件读取错误");
            //System.out.println(e.toString());
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("后续代码");
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
