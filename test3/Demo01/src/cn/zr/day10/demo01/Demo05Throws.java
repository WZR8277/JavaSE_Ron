package cn.zr.day10.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

//交给别人处理 最终交给JVM  方法声明时处理 多个异常必须声明多个异常（无共同父类异常）
public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        readFile("/Users/loganlee/Downloads/cat_kind-master");
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
