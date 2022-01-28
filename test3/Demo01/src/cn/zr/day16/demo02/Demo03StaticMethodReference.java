package cn.zr.day16.demo02;

public class Demo03StaticMethodReference {
    public static void main(String[] args) {

        int abs =method(-10,num -> Math.abs(num));
        System.out.println(abs);
        int abs2 = method(-10,Math::abs);
        System.out.println(abs2);
    }
    public static int method(int num,Calcable c){
        return c.calsAbs(num);
    }
}
