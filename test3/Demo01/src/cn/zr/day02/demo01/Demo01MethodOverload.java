package cn.zr.day02.demo01;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)10));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,10L));
    }

    public static boolean isSame(byte a, byte b){
        System.out.println("两个byte参数方法执行！");
        boolean same;
        if(a==b){
            same = true;
        }else{
            same=false;
        }
        return same;
    }

    public static boolean isSame(short a, short b){
        System.out.println("两个short参数方法执行！");
        boolean same= a==b? true:false;

        return same;
    }

    public static boolean isSame(int a, int b){
        System.out.println("两个int参数方法执行！");
        return a==b;
    }

    public static boolean isSame(long a, long b){
        System.out.println("两个long参数方法执行！");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
