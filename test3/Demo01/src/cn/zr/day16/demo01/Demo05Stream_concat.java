package cn.zr.day16.demo01;

import java.util.stream.Stream;

public class Demo05Stream_concat {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("张三峰", "张无忌", "王五", "赵六", "田七");
        String[] arr = {"美羊羊","喜羊羊","懒洋洋","红太狼","灰太狼"};
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));

    }
}
