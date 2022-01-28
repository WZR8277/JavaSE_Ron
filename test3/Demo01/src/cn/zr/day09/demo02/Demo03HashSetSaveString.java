package cn.zr.day09.demo02;

import java.util.HashSet;
import java.util.Set;

//set元素不重复原理
public class Demo03HashSetSaveString {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String s1 = "abc";
        set.add(s1);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
