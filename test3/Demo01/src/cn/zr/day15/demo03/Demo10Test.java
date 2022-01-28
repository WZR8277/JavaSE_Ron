package cn.zr.day15.demo03;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo10Test {

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴，女","古力娜扎，女","刘诗诗，女","胡歌，男"};
        ArrayList<String> list= filter(arr,
                (String s)->{
                    return s.split("，")[0].length()==4;
                },
                (String s)->{
                    return s.split("，")[1].equals("女");
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

}
