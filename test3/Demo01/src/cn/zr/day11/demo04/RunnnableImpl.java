package cn.zr.day11.demo04;

public class RunnnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("创建了一个新线程："+Thread.currentThread().getName());
    }
}
