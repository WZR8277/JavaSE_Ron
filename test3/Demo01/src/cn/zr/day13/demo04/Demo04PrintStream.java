package cn.zr.day13.demo04;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//只管输出 永远没有IOException
public class Demo04PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello,World!");
        PrintStream printStream = new PrintStream("/Users/loganlee/Desktop/b.txt");
        printStream.write(97);
        printStream.println(8.8);
        printStream.println("abc");
        printStream.close();

        System.out.println("我在控制台输出");
        PrintStream ps= new PrintStream("/Users/loganlee/Desktop/b.txt");
        System.setOut(ps);
        System.out.println("我在打印流输出");
    }
}
