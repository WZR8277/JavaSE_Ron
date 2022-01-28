package cn.zr.day09.demo05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01Map {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        //show04();
        //show05();
        show06();
    }

    private static void show06() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("李晨",20);
        map.put("范冰冰",21);
        map.put("Ron",22);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    private static void show05() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("李晨",20);
        map.put("范冰冰",21);
        map.put("Ron",22);

        Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

    private static void show04() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("李晨",20);
        map.put("范冰冰",21);
        map.put("Ron",22);

        System.out.println(map.containsKey("Ron"));
        System.out.println(map.containsValue(30));
    }

    private static void show03() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("李晨",20);
        map.put("范冰冰",21);
        map.put("Ron",22);
        System.out.println(map.get("Ron"));
    }

    private static void show02() {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("李晨",20);
        map.put("范冰冰",21);
        map.put("Ron",22);
        System.out.println(map);
        System.out.println(map.remove("范冰冰"));
/*        int i = map.remove("kk");
        System.out.println(i);*/
    }

    private static void show01() {
        HashMap<String,String> map = new HashMap<>();

        String v1 = map.put("李晨","范冰冰");
        System.out.println(v1);
        System.out.println(map);

    }
}
