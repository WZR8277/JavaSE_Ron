package cn.zr.day11.demo03;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {

                while (true){
                    synchronized (obj){
                        System.out.println("告诉老板对包子的需求");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了，开始吃");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5秒后做好包子，告知顾客，可以吃包子");
                        obj.notify();
                    }
                }
            }
        }.start();;
    }
}
