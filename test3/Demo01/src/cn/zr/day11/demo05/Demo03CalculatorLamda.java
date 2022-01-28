package cn.zr.day11.demo05;

public class Demo03CalculatorLamda {
    public static void main(String[] args) {

        invokeCalc(10,20,(int a,int b)->{return a+b;});
        invokeCalc(10,20,(a,b)->{return a+b;});
        invokeCalc(10,20,(a,b)->a+b);
    }

    private static void invokeCalc(int a ,int b,Calculator c) {
        int sum =c.calc(a,b);
        System.out.println(sum);
    }


}
