package cn.zr.day08.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代：在取出元素判断集合有没有元素，有就取出来，循环往复
//迭代器是接口 需要实现类
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        //多态  接口  实现类
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("===============");
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }
        System.out.println("===============");
        demo01();//增强for遍历数组

        System.out.println("===============");
        demo02();//增强for遍历集合
    }

    private static void demo02() {
        ArrayList<String> list  =  new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        for (String s:list){
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
