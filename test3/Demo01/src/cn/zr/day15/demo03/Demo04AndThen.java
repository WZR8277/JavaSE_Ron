package cn.zr.day15.demo03;

import java.util.Locale;
import java.util.function.Consumer;

public class Demo04AndThen {

    public static void main(String[] args) {
        method("Hello",
                (t)->{
            System.out.println(t.toUpperCase());},
                (t)->{
                    System.out.println(t.toLowerCase());});
    }
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }
}
