package cn.zr.day09.demo05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo03LinkedHashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        LinkedHashMap<Person,String> map = new LinkedHashMap<>();
        map.put(new Person("李晨",18),"北京");
        map.put(new Person("范冰冰",19),"上海");
        map.put(new Person("Ron",20),"广州");

        Set<Map.Entry<Person, String>> entries = map.entrySet();

        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    private static void show01() {
        HashMap<Person,String> map = new HashMap<>();

        map.put(new Person("李晨",18),"北京");
        map.put(new Person("范冰冰",19),"上海");
        map.put(new Person("Ron",20),"广州");

        Set<Map.Entry<Person, String>> entries = map.entrySet();

        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
