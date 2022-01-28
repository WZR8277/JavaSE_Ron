package cn.zr.day16.demo01;

import java.util.stream.Stream;

public class Demo06Stream_map {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> integerStream = stream.map(s -> Integer.parseInt(s));
        integerStream.forEach(i-> System.out.println(i));
    }
}
