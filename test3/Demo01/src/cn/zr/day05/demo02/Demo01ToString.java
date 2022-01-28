package cn.zr.day05.demo02;

public class Demo01ToString {

    public static void main(String[] args) {

        Person p1 = new Person("张三",18);
        System.out.println(p1);

        Person p2 = new Person("张三",18);
        System.out.println(p2);

        System.out.println(p1.equals(p2));

    }
}
