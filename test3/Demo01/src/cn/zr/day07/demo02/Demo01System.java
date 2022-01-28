package cn.zr.day07.demo02;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        int[] src = {1,2,3,4,5};
        int[] dest ={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+Arrays.toString(dest));
    }

    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序耗时"+(e-s)+"毫秒");
    }
}
