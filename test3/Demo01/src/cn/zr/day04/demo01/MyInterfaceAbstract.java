package cn.zr.day04.demo01;

public interface MyInterfaceAbstract {

    public static final int NUM=10;
    public abstract void methodAbs1();//=没有public/abstract
    public abstract void methodAbs2();
    public abstract void methodAbs3();
    public abstract void methodAbs4();
    public default void methodDefault(){
        System.out.println("default methodB");
    }
    public static void methodStatic1(){
        System.out.println("static method");
        methodStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("static method");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){
        System.out.println("static commom");
    }
}
