package cn.zr.day16.demo01;

import java.util.stream.Stream;

public class Demo04Stream_forEach {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name-> System.out.println(name));
    }
}
