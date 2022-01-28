package cn.zr.day10.demo02;

public class MyThread extends Thread{

    public MyThread(){}
    public MyThread(String name){
        super(name);//分类给他起名字
    }
    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            System.out.println("run:"+i);
            //System.out.println(getName());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
