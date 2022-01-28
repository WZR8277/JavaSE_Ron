package cn.zr.day14.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
// Demo01/src/cn/zr/day14/web/index.html
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true){
            Socket accept = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = accept.getInputStream();

                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        String s = bufferedReader.readLine();
                        System.out.println(s);
                        String[] arr = s.split(" ");
                        String htmlPath = arr[1].substring(1);

                        FileInputStream fileInputStream = new FileInputStream(htmlPath);
                        OutputStream outputStream = accept.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                        outputStream.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        outputStream.write("\r\n".getBytes());

                        int len=0;
                        byte[] bytes = new byte[1024];
                        while ((len=fileInputStream.read(bytes))!=-1){
                            outputStream.write(bytes,0,len);
                        }

                        fileInputStream.close();
                        accept.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        //serverSocket.close();
    }
}
