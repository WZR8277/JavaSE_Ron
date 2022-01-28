package cn.zr.day09.demo02;
//哈希值是系统随机给出的逻辑地址（不是物理地址），十进制
public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);

        System.out.println("种地".hashCode());
        System.out.println("通话".hashCode());
    }
}
