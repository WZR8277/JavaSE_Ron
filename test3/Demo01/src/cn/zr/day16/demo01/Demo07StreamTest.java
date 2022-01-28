package cn.zr.day16.demo01;


import java.util.List;
import java.util.stream.Stream;

public class Demo07StreamTest {
    public static void main(String[] args) {
        List<String> one = List.of("喜羊羊","张洋洋","王洋洋","灰太","红太狼");
        List<String> two = List.of("张三峰", "张无忌", "王五", "张六", "田七");

        Stream<String> limit = one.stream().filter(name -> name.length() == 3).limit(3);
        Stream<String> skip = two.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(limit,skip).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
