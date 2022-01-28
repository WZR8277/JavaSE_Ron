package cn.zr.day12.demo02;

public class Demo01Recurison {
    public static void main(String[] args) {
        //a();
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if (i==50000){
            return;
        }
        b(++i);
    }

    private static void a() {
        System.out.println("Method a");
        a();
    }
}
