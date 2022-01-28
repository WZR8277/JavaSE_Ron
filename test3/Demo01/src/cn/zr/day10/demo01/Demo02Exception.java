package cn.zr.day10.demo01;

public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr ={1,2,3};

        int e = getElement(arr,3);
        System.out.println(e);
    }

    private static int getElement(int[] arr,int index) {
        int ele = arr[index];
        return ele ;
    }
}
