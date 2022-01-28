package cn.zr.day15.demo03;

import java.util.function.Predicate;

public class Demo08Predicate_or {
    public static void main(String[] args) {
        String s ="abcdef";
        boolean b = checkString(s,str->str.length()>6,str->str.contains("a"));
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.or(pre2).test(s);
    }
}
