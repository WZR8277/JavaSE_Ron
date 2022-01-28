package cn.zr.day15.demo03;

import java.util.function.Function;

public class Demo13Test {
    public static int change(String s, Function<String,String> fun1, Function<String,Integer> fun2,
                             Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "刘诗诗，20";
        int num =change(str,(s)->{return s.split("，")[1];},(s)->{return Integer.parseInt(s);},
                (i)->{return i+100;});
        System.out.println(num);
    }
}
