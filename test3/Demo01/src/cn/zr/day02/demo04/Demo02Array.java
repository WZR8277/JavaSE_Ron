package cn.zr.day02.demo04;

public class Demo02Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马尔扎哈",38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//cn.zr.day02.demo04.Person@36baf30c 需要构造方法获取元素
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());
    }
}
