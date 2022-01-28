package cn.zr.day01.demo01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
//        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sum(int a, int b){
        int result = a+b;

        return result;
    }
}
