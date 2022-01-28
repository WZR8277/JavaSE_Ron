package cn.zr.day09.demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

//hashset+一条链表 保证元素有序
public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("com");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("com");
        System.out.println(linked);
    }
}
