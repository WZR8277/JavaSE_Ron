package cn.zr.day17.demo01.reflect;


import java.lang.reflect.Constructor;

public class Demo03Reflect {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);

        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        //空参数构造简化
        Person person2 = personClass.newInstance();
        System.out.println(person2);
    }
}
