package cn.zr.day15.demo03;

import java.util.function.Supplier;

public class Demo02Test {

    public static void main(String[] args) {
        int[] arr = {1,3,99,0,87};
        int max = getMax(()->{
            int myMax =arr[0];
            for (int i : arr) {
                if(i>myMax)
                    myMax=i;
            }
            return myMax;
        });
        System.out.println(max);
    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
