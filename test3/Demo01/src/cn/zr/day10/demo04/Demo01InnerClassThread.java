package cn.zr.day10.demo04;

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

        Runnable r =new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <20; i++) {
                    System.out.println("Ron+"+i);
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("胡翊凡");
            }
        }).start();
    }
}
