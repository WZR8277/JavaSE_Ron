package cn.zr.day09.demo03;
//可变参数底层是数组 创建长度可变的数组  一个方法只可以有一个可变参数 如果方法参数有多个 可变参数必须是最后一个参数
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10,20,30);
        System.out.println(i);
    }

    private static int add(int...arr) {

        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(arr);
        System.out.println(arr.length);
        return sum;
    }
}
