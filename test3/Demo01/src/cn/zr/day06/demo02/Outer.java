package cn.zr.day06.demo02;

/*
1.外部类：public/default
2.成员内部类：都可以
3.局部内部类：都不能些 该方法调用
*/

public class Outer {

    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }


}
