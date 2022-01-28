package cn.zr.day09.demo02;

import java.util.HashSet;

//需要重写hascode和equals
public class Demo04HashSetSavePerson {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("胡翊凡",21);
        Person p2 = new Person("胡翊凡",21);
        Person p3 = new Person("胡翊凡",20);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(set);
    }
}
