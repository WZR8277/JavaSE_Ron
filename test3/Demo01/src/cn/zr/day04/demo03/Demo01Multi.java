package cn.zr.day04.demo03;

public class Demo01Multi {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//Zi 方法看new谁，没有则向上找
        System.out.println(obj.num);//Fu 成员变量看左边 不能向下找
        System.out.println("=================");
        obj.showNum();//方法属于谁，除非重写了
        //obj.methodZi();编译看左边 fu没有methodZi 所以错误 运行看右边（上述） 成员变量都看左边

        giveMePet(new Zi2());

    }

    public static void giveMePet(Fu obj){
        if(obj instanceof Zi){
            Zi zi =(Zi)obj;
            zi.methodZi();
        }

        if(obj instanceof Zi2){
            Zi2 zi2 =(Zi2)obj;
            zi2.methodZi2();
        }
    }
}
