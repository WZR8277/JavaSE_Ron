package cn.zr.day09.demo01;

import java.util.LinkedList;

//查询慢 增删快
public class Demo01LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        String fst = linked.removeFirst();
        //String fst = linked.removeFirst();
        System.out.println("被移除的第一个元素："+fst);
        String lst = linked.removeLast();
        System.out.println("被移除的最后一个元素："+lst);

        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }

    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);
        //linked.push("www");
        linked.addLast("com");
        System.out.println(linked);
    }
}
