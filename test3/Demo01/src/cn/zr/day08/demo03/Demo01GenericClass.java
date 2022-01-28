package cn.zr.day08.demo03;

public class Demo01GenericClass {
    public static void main(String[] args) {
        //不写泛型默认是Object
        GenericClass gc = new GenericClass();
        gc.setName("是字符串");
        System.out.println(gc.getName());

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        System.out.println(gc2.getName());
    }
}
