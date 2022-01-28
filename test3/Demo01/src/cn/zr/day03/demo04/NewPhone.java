package cn.zr.day03.demo04;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("show image");
        System.out.println("show name");
    }
    public NewPhone(){
        System.out.println("子类构造方法");
    }
}
