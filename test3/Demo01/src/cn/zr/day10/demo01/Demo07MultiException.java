package cn.zr.day10.demo01;

import java.util.List;

public class Demo07MultiException {
    public static void main(String[] args) {
        //多次捕获 多次处理
/*        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/
        //一次捕获多次处理 但是子类异常必须在上面
/*        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/
        //多个异常一次捕获一次处理 Exception万能
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("后续代码");
    }
}
