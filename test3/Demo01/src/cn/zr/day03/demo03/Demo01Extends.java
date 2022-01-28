package cn.zr.day03.demo03;

public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
        Assistant assistant = new Assistant();
        assistant.method();
        System.out.println(teacher.num);//优先子类
        teacher.methodEmployee();//employee的num
        teacher.methodTeacher();
    }
}
