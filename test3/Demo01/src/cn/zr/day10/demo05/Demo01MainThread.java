package cn.zr.day10.demo05;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        System.out.println(0/0);//主线程前面异常后 下面不再执行
        Person p2 = new Person("旺财");
        p2.run();
    }
}
