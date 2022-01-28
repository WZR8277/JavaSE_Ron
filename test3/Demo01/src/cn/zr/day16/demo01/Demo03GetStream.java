package cn.zr.day16.demo01;

import java.util.*;
import java.util.stream.Stream;

public class Demo03GetStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        HashMap<String, String> hashMap = new HashMap<>();
        Set<String> keySet = hashMap.keySet();
        Stream<String> stream3 = keySet.stream();

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        Stream<Integer> stream5= Stream.of(1, 2, 3, 4, 5);

        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream6 = Stream.of(arr);

    }
}
