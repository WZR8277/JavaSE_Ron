package cn.zr.day13.demo01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04TryCatch {
    public static void main(String[] args) {

        FileWriter fw = null;//否则close找不到fw
        try {
            fw = new FileWriter("/Users/loganlee/Desktop/c.txt",true);
            for (int i = 0; i <10; i++) {
                fw.write("Hello"+i+"\r");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){//null无法调用close
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
