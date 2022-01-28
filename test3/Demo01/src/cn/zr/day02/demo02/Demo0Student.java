package cn.zr.day02.demo02;

public class Demo0Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");
        stu.name = "昭昭";
        stu.age = 21;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("==============");
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
