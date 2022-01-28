package cn.zr.day15.demo01;

public class Demo01FunctionalInterface {
    public static void main(String[] args) {

        show(new MyFunctionalInterfaceImpl());
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现MyFunctionalInterface");
            }
        });
        show(()-> System.out.println("lambda实现MyFunctionalInterface"));
    }

    private static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }
}
