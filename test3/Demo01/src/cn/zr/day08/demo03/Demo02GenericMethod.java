package cn.zr.day08.demo03;

public class Demo02GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("ab");
        gm.method01(1.1);

        GenericMethod.method02("静态方法");
    }
}
