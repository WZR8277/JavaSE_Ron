package cn.zr.day09.demo05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();//作为key必须重写hascode和equals
    }

    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();

        map.put(new Person("李晨",18),"北京");
        map.put(new Person("范冰冰",19),"上海");
        map.put(new Person("Ron",20),"广州");

        Set<Map.Entry<Person, String>> entries = map.entrySet();

        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    private static void show01() {
        HashMap<String,Person> map = new HashMap<>();

        map.put("北京",new Person("李晨",18));
        map.put("上海",new Person("范冰冰",19));
        map.put("广州",new Person("Ron",20));

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+"="+map.get(string));
        }

    }
}
