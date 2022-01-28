package cn.zr.day04.demo01;

public interface MyInterface {
    public default void methodFu(){
        System.out.println("same name methodFu in interface");
    }
}
