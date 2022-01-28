package cn.zr.day08.demo02;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        //show01();//不使用泛型 向下转型使用子类方法会抛出异常
        show02();//使用泛型 运行期异常提前到了编译期
    }

    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //list.add(1);编译
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}
