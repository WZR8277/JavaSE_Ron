package cn.zr.day15.demo02;

public class Demo03Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        startThread(()->System.out.println(Thread.currentThread().getName()));
    }

    private static void startThread(Runnable run) {
        new Thread(run).start();
    }
}
