package cn.zr.day02.demo01;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        int[] arrayB = new int[]{5,15,25};
        int[] arrayC = {10,20,30};
        int[] arrayD ;
        arrayD = new int[]{11,21,31,50,43,24};
        System.out.println("A数组地址"+arrayA);//[I@4617c264 [数组 I int类型 后面数组是内存哈希值
        System.out.println("B数组长度"+arrayB.length);
        System.out.println("==================");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
        System.out.println("打擂台");
        int maxNum=0;
        for (int i = 0; i < arrayD.length; i++) {
            if(arrayD[i]>maxNum)
                maxNum=arrayD[i];
        }
        System.out.println(maxNum);
        System.out.println("数组元素反转");

        int temp;
        for(int minIndex=0,maxIndex=arrayD.length-1;minIndex<maxIndex;minIndex++,maxIndex--){
            temp=arrayD[minIndex];
            arrayD[minIndex]=arrayD[maxIndex];
            arrayD[maxIndex]=temp;
        }
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }

    }
}
