package cn.zr.day15.demo03;

import java.util.function.Predicate;

public class Demo09Predicate_negate {
    public static void main(String[] args) {
        String s ="abcdef";
        boolean b = checkString(s,str->str.length()>5);
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre1){
        return pre1.negate().test(s);
    }
}
