package cn.zr.day05.demo01;
//引用类型final变量 地址不可变 基本类型final变量内容不可变
public class Demo01Final {
    public static void main(String[] args) {
        String str1 = "abc";
        str1="bcd";
        System.out.println(str1);
//        final String str2 = "abc";
//        str2 ="bcd"; 报错 不可以  字符串常量不是内容 有不同固定地址

    }
}
