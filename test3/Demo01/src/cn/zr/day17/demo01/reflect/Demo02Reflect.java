package cn.zr.day17.demo01.reflect;

import java.lang.reflect.Field;

public class Demo02Reflect {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-------------");

        Field as = personClass.getField("a");
        Person person = new Person();
        Object o = as.get(person);
        System.out.println(o);

        as.set(person,"张三");
        System.out.println(person);

        System.out.println("-------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field ds = personClass.getDeclaredField("c");
        ds.setAccessible(true);//暴力反射私有可以访问
        Object o1 = ds.get(person);
        System.out.println(o1);
    }
}
