package cn.zr.day15.demo03;

import java.util.function.Supplier;

public class Demo1Supplier {
    public static void main(String[] args) {

        System.out.println(getString(()->{return "胡歌";}));
        System.out.println(getString(()->"胡歌"));
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
