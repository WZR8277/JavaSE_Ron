package cn.zr.day17.demo01.reflect;



public class Demo01Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("cn.zr.day17.demo01.reflect.Person");//用于配置文件 将类名定义在配置文件中。读取文件，加载类
        System.out.println(aClass);

        Class<Person> personClass = Person.class;//多用于参数的传递
        System.out.println(personClass);

        Person person = new Person();
        Class aClass3 = person.getClass();
        System.out.println(aClass3);

        System.out.println(aClass==personClass);//多用于对象的获取字节码的方式
        System.out.println(aClass3==personClass);//统一字节码文件只加载进内存一次
    }
}
