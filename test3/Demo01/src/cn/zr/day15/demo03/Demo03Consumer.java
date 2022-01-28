package cn.zr.day15.demo03;

import java.util.function.Consumer;

public class Demo03Consumer {
    public static void main(String[] args) {
        method("刘诗诗",(String name)->{
            System.out.println(name);
            System.out.println(new StringBuilder(name).reverse().toString());
        });
    }

    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }
}
