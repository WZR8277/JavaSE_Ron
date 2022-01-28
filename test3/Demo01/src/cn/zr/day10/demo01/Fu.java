package cn.zr.day10.demo01;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}
class Zi extends Fu{
    //重写父类抛出和父类相同异常
    public void show01() throws NullPointerException,ClassCastException{}
    //抛出分类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //不抛出异常
    public void show03(){}
    //不能抛出异常 只能捕获处理
    public void show04(){
        try {
            throw new Exception("编译异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
