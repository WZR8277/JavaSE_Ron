package cn.zr.day15.demo03;

import java.util.function.Function;

public class Demo11Function {
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,str->Integer.parseInt(str));
    }
}
