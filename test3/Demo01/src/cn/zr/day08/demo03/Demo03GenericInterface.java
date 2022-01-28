package cn.zr.day08.demo03;

public class Demo03GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("abc");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2();
        gi2.method(19);
    }
}
