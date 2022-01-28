package cn.zr.day06.demo02;

public class MyOuter {

    public void methodOuter(){
        final int num =10;//栈内存中

        class MyInnner{//堆内存中 生命周期长 把不变的局部变量  拷贝进来
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
