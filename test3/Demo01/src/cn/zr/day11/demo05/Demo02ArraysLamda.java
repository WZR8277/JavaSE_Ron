package cn.zr.day11.demo05;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02ArraysLamda {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("Ron",18),
                new Person("Ronmy",17),
                new Person("Ronme",16),
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        Arrays.sort(arr,(Person o1, Person o2)->{return o1.getAge()- o2.getAge();});
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

