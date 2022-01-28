package cn.zr.day15.demo03;

import java.util.function.Predicate;

public class Demo06Predicate {
    public static void main(String[] args) {
        String s ="abcde";
        boolean b = checkString(s,str->str.length()>5);
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
