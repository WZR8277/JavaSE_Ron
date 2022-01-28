package cn.zr.day03.demo03;

public class Teacher extends Employee{
    int num=200;

    public void methodTeacher(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    @Override
    public void method(){
        System.out.println("子类方法执行");
    }
    @Override
    public String method1(){//String小于Object  public权限大于default
        return null;
    }
}
