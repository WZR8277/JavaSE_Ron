package cn.zr.day08.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Collection {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("ZR");
        coll.add("java");
        System.out.println(coll);

        boolean result = coll.remove("ZR");
        System.out.println(result);
        System.out.println(coll);

   /*     coll.clear();
        System.out.println(coll);*/

        boolean result1 = coll.contains("java");
        System.out.println(result1);

        System.out.println(coll.isEmpty());

        System.out.println(coll.size());

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
