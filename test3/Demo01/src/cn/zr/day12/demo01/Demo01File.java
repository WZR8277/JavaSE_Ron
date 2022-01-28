package cn.zr.day12.demo01;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);//macos linus是/  windows是\ 都可以写成"File.separator" 路径要写两个斜杠
    }
}
