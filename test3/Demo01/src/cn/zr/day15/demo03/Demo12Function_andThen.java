package cn.zr.day15.demo03;

import java.util.function.Function;

public class Demo12Function_andThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,str->Integer.parseInt(str)+10,in->in+"");
    }
}
