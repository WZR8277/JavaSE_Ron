package cn.zr.day10.demo01;

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
/*        if(obj==null){
            throw new NullPointerException("传递对象为空");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递对象为空");//重载的方法
    }
}
