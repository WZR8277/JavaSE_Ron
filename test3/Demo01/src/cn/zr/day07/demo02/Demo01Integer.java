package cn.zr.day07.demo02;

import java.util.ArrayList;

/*装箱：基本——》包装类
* */
public class Demo01Integer {
    public static void main(String[] args) {
        Integer in1 = Integer.valueOf(1);
        System.out.println(in1);

        Integer in2 = Integer.valueOf("1");
        System.out.println(in2);

        int i = in1.intValue();
        System.out.println(i);

        System.out.println("=================");
        Integer in3 = 1;//自动装箱
        System.out.println(in3);
        in3 = in3+2;//自动拆箱成为int 又自动装箱
        System.out.println(in3);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱
        int a  = list.get(0);//自动拆箱
        System.out.println(a);
    }
}
