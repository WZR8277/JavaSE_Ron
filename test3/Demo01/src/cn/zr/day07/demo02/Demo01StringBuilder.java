package cn.zr.day07.demo02;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu1:"+bu2);

        StringBuilder bu3 = new StringBuilder();
        StringBuilder bu4 = bu3.append("abc");
        System.out.println(bu3);
        System.out.println(bu4);
        System.out.println(bu3==bu4);

        bu1.append(1);
        bu1.append(true);
        bu1.append(8.8);
        bu1.append("中");
        System.out.println(bu1);

        bu2.append(1).append(true).append(8.8).append("中");
        System.out.println(bu2);

        String str = "hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu:"+bu);
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
