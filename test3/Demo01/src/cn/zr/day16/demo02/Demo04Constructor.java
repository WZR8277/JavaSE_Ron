package cn.zr.day16.demo02;

public class Demo04Constructor {
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("迪丽热巴",name -> new Person(name));

        printName("迪丽热巴",Person::new);
    }
}
