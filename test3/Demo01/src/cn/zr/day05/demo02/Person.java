package cn.zr.day05.demo02;

import java.util.Objects;

public class Person<toString> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

/*    @Override
    public String toString(){
        return "Person{name="+name+"，age="+age+"}";
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //反射技术 getClass() != o.getClass() 等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person<?> person = (Person<?>) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
