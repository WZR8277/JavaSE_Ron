package cn.zr.day13.demo04;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID=1l;//无论这个类是否修改 序列号都不修改 都可以序列化成功
    private String name;
    //private transient int age;//不可被序列化 static也不可
    private int age;
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
