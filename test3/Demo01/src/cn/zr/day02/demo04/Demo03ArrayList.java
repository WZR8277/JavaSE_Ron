package cn.zr.day02.demo04;

import java.util.ArrayList;
//泛型：集合中元素的统一类型
public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//打印内容 不是地址

        list.add("Tomas");
        list.add("Jack");
        list.add("Mike");
        System.out.println(list);

        String whoRemoved = list.remove(1);
        System.out.println("被删的是："+whoRemoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合长度"+size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
