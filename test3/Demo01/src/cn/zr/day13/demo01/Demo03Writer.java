package cn.zr.day13.demo01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/loganlee/Desktop/c.txt",true);

        char[] cs = {'a', 'b', 'c','d','e'};
        fw.write(cs);
        fw.write(cs,1,3);
        fw.write("Ron");
        fw.write("coder",2,3);
        fw.write("\r");
        for (int i = 0; i <10; i++) {
            fw.write("Hello"+i+"\r");
        }

        fw.close();
    }
}
