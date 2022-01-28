package cn.zr.day03.demo02;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        int[] array1={1,2,3,6,4,0};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
