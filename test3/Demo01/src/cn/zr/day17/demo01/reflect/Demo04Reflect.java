package cn.zr.day17.demo01.reflect;


import java.lang.reflect.Method;

public class Demo04Reflect {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person person = new Person();
        eat.invoke(person);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"rice");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }

        System.out.println(personClass.getName());
    }
}
