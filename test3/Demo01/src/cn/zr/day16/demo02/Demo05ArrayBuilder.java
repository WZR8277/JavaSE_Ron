package cn.zr.day16.demo02;

public class Demo05ArrayBuilder {
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        //int[] array = createArray(10, len -> new int[len]);
        int[] array = createArray(10, int[]::new);

        System.out.println(array.length);
    }
}
