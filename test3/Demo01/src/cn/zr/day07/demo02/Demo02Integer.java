package cn.zr.day07.demo02;

public class Demo02Integer {
    public static void main(String[] args) {
        //基本类型-->字符串
        String s1 = 100+"";
        System.out.println(s1+200);

        String s2 = Integer.toString(100);
        System.out.println(s2+200);

        String s3 = String.valueOf(100);
        System.out.println(s3+200);

        //字符串 -->基本类型
        int i = Integer.parseInt("100");
        System.out.println(i+200);

    }
}
