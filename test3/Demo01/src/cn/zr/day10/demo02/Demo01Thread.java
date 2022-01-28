package cn.zr.day10.demo02;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("mythread");
        mt.start();
        for (int i = 0; i <20; i++) {
            System.out.println("main:"+i);
            System.out.println(Thread.currentThread().getName());
        }

        //MyThread mt = new MyThread("mythread");

    }
}
