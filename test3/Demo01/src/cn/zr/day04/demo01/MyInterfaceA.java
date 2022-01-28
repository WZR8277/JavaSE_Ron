package cn.zr.day04.demo01;

public interface MyInterfaceA {
    public default void methodDefault(){
        System.out.println("default methodA");
    }
}
