package cn.zr.day15.demo03;

import java.util.function.Consumer;

public class Demo05Test {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴，女","刘诗诗，女","胡歌，男"};
        method(arr,
                (s)->{
                    String name = s.split("，")[0];
                    System.out.print("姓名："+name+" ");
                    },
                (s)->{
                    String sex = s.split("，")[1];
                    System.out.println("姓名："+sex);});
    }
    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
