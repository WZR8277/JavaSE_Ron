package cn.zr.day09.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparable自己和参数比较 comparator裁判
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
    }
}
