package cn.zr.day04.demo01;

public class MyInterfaceAbstractImpl extends Fu implements MyInterfaceAbstract,MyInterfaceA,MyInterface{
    @Override
    public void methodAbs1() {
        System.out.println("implements one");//必须全部重写接口抽象方法
    }

    @Override
    public void methodAbs2() {
        System.out.println("implements two");
    }

    @Override
    public void methodAbs3() {
        System.out.println("implements three");
    }

    @Override
    public void methodAbs4() {
        System.out.println("implements four");
    }

    @Override
    public void methodDefault() {
        MyInterfaceAbstract.super.methodDefault();//必须覆盖重写一样的默认方法
    }
}
