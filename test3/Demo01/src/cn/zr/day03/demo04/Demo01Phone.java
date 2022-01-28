package cn.zr.day03.demo04;
//可以通过super重载父类构造方法
//子类重载父类构造方法必须把super放第一个语句 构造中this也是这样
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("===============");
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
