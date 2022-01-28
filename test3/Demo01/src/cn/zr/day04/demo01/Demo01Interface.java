package cn.zr.day04.demo01;

public class Demo01Interface {
    public static void main(String[] args) {

        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodDefault();//也可以被覆盖重写
        //impl.methodStatic();错误
        MyInterfaceAbstract.methodStatic1();
        //MyInterfaceAbstract.methodStaticCommom();错误
        System.out.println(MyInterfaceAbstract.NUM);
        //优先父类
        impl.methodFu();
    }
}
