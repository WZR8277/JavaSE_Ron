package cn.zr.day02.demo04;

import java.util.Scanner;

public class Demo01Anonymous {
    public static void main(String[] args) {
        //匿名对象 使用一次
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);
        System.out.println("================");
        methodParam(new Scanner(System.in));
        System.out.println("================");
        Scanner sc = methodReturn();
        System.out.println("输入的是："+sc.nextInt());

    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
