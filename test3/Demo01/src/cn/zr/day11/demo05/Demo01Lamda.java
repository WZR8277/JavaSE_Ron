package cn.zr.day11.demo05;
//(参数列表）->{一些重写的代码}
public class Demo01Lamda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建了一个新线程："+Thread.currentThread().getName());
            }
        }).start();

        new Thread(() ->{
                System.out.println("创建了一个新线程："+Thread.currentThread().getName());}
        ).start();
    }
}
