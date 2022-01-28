package cn.zr.day14.demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){//服务器一直启动
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = accept.getInputStream();

                        File file = new File("/Users/loganlee/Desktop");
                        if(!file.exists()){
                            file.mkdirs();
                        }

                        String fileName = "Ron"+System.currentTimeMillis()+new
                                Random().nextInt(999999)+".jpg";
                        FileOutputStream fileOutputStream = new FileOutputStream(file + "/"+fileName);

                        int len=0;
                        byte[] bytes = new byte[1024];
                        while ((len=inputStream.read(bytes))!=-1){
                            fileOutputStream.write(bytes,0,len);
                        }

                        OutputStream outputStream = accept.getOutputStream();
                        outputStream.write("上传成功".getBytes());

                        fileOutputStream.close();
                        accept.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
        //serverSocket.close();
    }
}
