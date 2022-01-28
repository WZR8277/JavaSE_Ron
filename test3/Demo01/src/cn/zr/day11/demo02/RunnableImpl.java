package cn.zr.day11.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//同步代码块
public class RunnableImpl implements Runnable{

    private static int ticket =100;
    Object obj = new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true){
            //同步代码块
/*            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }*/
            //payTicket();
            //lock锁
            lock.lock();
            if(ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
    //静态同步方法  访问变量也必须静态 锁对象是RunnableImpl.Class  不是this
    public  static  synchronized  void payTicket(){
        if(ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
            ticket--;
        }

    }
    //同步方法  锁对象就是线程实现类 this
/*    public  synchronized  void payTicket(){
        if(ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
            ticket--;
        }

    }*/
}
