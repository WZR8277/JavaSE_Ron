package cn.zr.day03.demo01;
/*
字符串常量池，程序中双引号字符串在字符串常量池中
基本类型 ==是数值比较
引用类型 ==是地址值比较
* */
public class Demo01StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false

        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("abc"));//true 不推荐这 这么写
        System.out.println("abc".equals(str3));//推荐

        String str4 =null;
        System.out.println("abc".equals(str4));//false
        //System.out.println(str4.equals("abc")); 报错
        System.out.println(str1.length());

        String str5 = "Hello";
        String str6 = "World";
        String str7 = str5.concat(str6);
        System.out.println(str7);
        System.out.println(str5);//str5不变

        char ch = str5.charAt(2);
        System.out.println(ch);
        int indexString = str5.indexOf("llo");
        System.out.println(indexString);

        String str8 = str6.substring(str6.indexOf("orl"));
        System.out.println(str8);
        String str9 = str6.substring(2,4);
        System.out.println(str9);

        String str10 ="会不会玩呀！你大爷的！";
        String strReplaced = str10.replace("大爷","**");
        System.out.println(strReplaced);

        String str11="aaa,bbc,ccc";
        String[] array1 = str11.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
