package cn.zr.day03.demo01;

public class Demo03StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();//对象里的方法需要先实例化
        MyClass obj2 = new MyClass();
        MyClass.methodStatic();
    }
}
