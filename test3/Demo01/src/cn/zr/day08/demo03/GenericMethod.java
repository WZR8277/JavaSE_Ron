package cn.zr.day08.demo03;

public class GenericMethod {
    //定义一个含有泛型的方法
    public <M> void method01(M m){
        System.out.println(m);
    }

    public static <S> void method02(S s){
        System.out.println(s);
    }
}
