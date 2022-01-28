package cn.zr.day09.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//有序 有索引 允许重复
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        list.add(3,"Ron");
        System.out.println(list);

        String removeE = list.remove(2);
        System.out.println("被移除元素："+removeE);
        System.out.println(list);

        String setE = list.set(0,"A");
        System.out.println("被替换元素："+setE);
        System.out.println(setE);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("=================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("===============");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
