package cn.zr.day03.demo01;

public class MyClass {
    public void method(){
        System.out.println("这是一个对象方法");
    }
    static {
        System.out.println("静态代码块执行了");
    }
    public static void methodStatic() {
        System.out.println("这是一个静态方法");
    }
}
