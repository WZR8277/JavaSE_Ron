package cn.zr.day13.demo04;

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",1));
        list.add(new Person("李四",2));
        list.add(new Person("王五",3));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("/Users/loganlee/Desktop/prop.txt"));
        objectOutputStream.writeObject(list);

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("/Users/loganlee/Desktop/prop.txt"));

        Object o = objectInputStream.readObject();

        ArrayList<Person> list2=(ArrayList<Person>) o;
        for (Person person : list2) {
            System.out.println(person);
        }

        objectInputStream.close();
        objectOutputStream.close();
    }
}
