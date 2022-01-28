package cn.zr.day04.demo02;

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void common();

    @Override//冲突的default方法必须重写 抽象不用 因为没有方法体
    default void methodDefault() {
        MyInterfaceA.super.methodDefault();
    }
}
