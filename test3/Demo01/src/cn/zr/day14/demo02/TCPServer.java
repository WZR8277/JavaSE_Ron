package cn.zr.day14.demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        File file = new File("/Users/loganlee/Desktop");
        if(!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file + "/upload1.jpg");

        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("长传成功".getBytes());

        fileOutputStream.close();
        accept.close();
        serverSocket.close();
    }
}
