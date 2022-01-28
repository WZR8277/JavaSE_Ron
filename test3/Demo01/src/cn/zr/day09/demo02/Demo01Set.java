package cn.zr.day09.demo02;

import java.util.HashSet;
import java.util.Set;

//不重复 无索引
//hashst无序 底层哈希表
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
