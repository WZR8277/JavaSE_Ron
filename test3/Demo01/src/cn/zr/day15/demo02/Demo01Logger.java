package cn.zr.day15.demo02;

public class Demo01Logger {
    public static void main(String[] args) {

        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1,msg1+msg2+msg3);//拼接后传参
    }

    private static void showLog(int level, String msg) {
        if (level==1){
            System.out.println(msg);
        }
    }
}
