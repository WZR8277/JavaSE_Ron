package cn.zr.day10.demo01;
//throw：1.RuntimeException及其子类 可以不处理 交给JVM处理 2.其他的必须处理 3.必须写在方法内部
public class Demo03Exception {
    public static void main(String[] args) {
        int[] arr =null;
        int e = getElement(arr,0);
        System.out.println(e);

        int[] arr2 = {1,2,3};
        int e2 = getElement(arr2,3);
        System.out.println(e2);
    }

    private static int getElement(int[] arr,int index) {
        if(arr==null){
            throw new NullPointerException("传递数组是空");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }

        int ele = arr[index];
        return ele ;
    }
}
