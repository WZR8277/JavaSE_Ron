package cn.zr.day13.demo03;

import java.io.*;

public class Demo05BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/loganlee/Desktop/prop.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
/*        char[] cs = new char[1024];
        int len = 0 ;
        while ((len=br.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }*/
        br.close();
    }
}
