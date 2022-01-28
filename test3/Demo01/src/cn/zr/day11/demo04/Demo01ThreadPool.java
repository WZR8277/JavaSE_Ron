package cn.zr.day11.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnnableImpl());//线程池一直开启 使用完线程 自动归还给线程池
        es.submit(new RunnnableImpl());
        es.submit(new RunnnableImpl());

        es.shutdown();//关闭线程池
    }
}
