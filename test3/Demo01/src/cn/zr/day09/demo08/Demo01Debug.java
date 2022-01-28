package cn.zr.day09.demo08;
//步过：逐行执行  步入：进入方法 步出：跳出方法 恢复程序：到下一个断点
public class Demo01Debug {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        int sum = a+b;
        System.out.println(sum);

        for (int i = 0; i <3 ; i++) {
            System.out.println(i);
        }

        print();
    }

    private static void print() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
