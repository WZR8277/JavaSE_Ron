package cn.zr.day14.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream
                ("/Users/loganlee/Desktop/桌面整理/WechatIMG46.jpeg");
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream outputStream = socket.getOutputStream();

        int len1=0;
        byte[] bytes1 = new byte[1024];
        while ((len1=fileInputStream.read(bytes1))!=-1){
            outputStream.write(bytes1,0,len1);
        }
        socket.shutdownOutput();//否则fos没被写入-1就不会结束

        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fileInputStream.close();
        socket.close();
    }
}
