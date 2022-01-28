package cn.zr.day09.demo06;

import java.util.HashMap;
import java.util.Hashtable;

//hashtable单线程 线程安全 速度慢 被hashmap取代 不可存空值
public class Demo01HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map01 = new HashMap<>();
        map01.put(null,"a");
        map01.put("b",null);
        System.out.println(map01);

//        Hashtable<String,String> table = new Hashtable<>();
//        table.put(null,"a");
    }
}
