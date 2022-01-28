package cn.zr.day09.demo04;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list02 = new ArrayList<>();
        Collections.addAll(list02,1,3,2);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        Person p1 = new Person("胡翊凡",20);
        Person p2 = new Person("王昭容",22);
        list03.add(p1);
        list03.add(p2);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
