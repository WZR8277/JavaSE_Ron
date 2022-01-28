package cn.zr.day08.demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(0);
        list01.add(1);

        ArrayList<String > list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
    }

    public static void printArray(ArrayList<?> list) {
        Iterator<?> it  = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
