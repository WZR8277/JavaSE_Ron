package cn.zr.day15.demo02;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Comparator {
    public static void main(String[] args) {
        String[] arr = {"a","bb","ccccc","ddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }

    private static Comparator<String> getComparator() {

        return (o1,o2)->o1.length()-o2.length();
    }
}
