package cn.zr.day16.demo02;

public class Demo01Printable {
    public static void main(String[] args) {
        printString(s -> System.out.println(s));
        printString(System.out::println);
    }

    public static void printString(Printable p){
        p.print("hello");
    }
}
