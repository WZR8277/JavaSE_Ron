package cn.zr.day12.demo02;

public class Demo02Recursion {
    public static void main(String[] args) {
        int total = 0;
        total =sum (10);
        System.out.println(total);
    }

    private static int sum(int i) {
        if(i==1){
            return 1;
        }
        return i+sum(i-1);
    }
}
