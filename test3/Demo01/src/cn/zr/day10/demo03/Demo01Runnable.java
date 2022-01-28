package cn.zr.day10.demo03;
/*1.一个类只能有一个父类，使用Runnable这个类还可以继承其他类
* 2.实现了设置线程任务和开启新线程分离（解耦）：实现类中run方法 再创建Thread对象实现方法*/
public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i <20; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
