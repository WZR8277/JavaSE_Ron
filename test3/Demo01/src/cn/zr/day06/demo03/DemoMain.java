package cn.zr.day06.demo03;


public class DemoMain {

    public static void main(String[] args) {
        MyInterFaceImpl impl = new MyInterFaceImpl();
        impl.method();
        System.out.println("==================");

        MyInterFace obj = new MyInterFace() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
        System.out.println("=================");
        new MyInterFace() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        }.method();
    }
}
