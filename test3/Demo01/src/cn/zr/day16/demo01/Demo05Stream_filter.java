package cn.zr.day16.demo01;

import java.util.stream.Stream;

public class Demo05Stream_filter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三峰", "张无忌", "王五", "赵六", "田七");
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));

        stream1.forEach(name-> System.out.println(name));
        //stream.forEach(name-> System.out.println(name));异常 管道流 使用后到下一个流 前一个关闭
    }
}
