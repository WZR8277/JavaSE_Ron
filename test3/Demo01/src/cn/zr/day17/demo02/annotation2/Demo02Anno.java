package cn.zr.day17.demo02.annotation2;
@SuppressWarnings("all")//压制所有警告
public class Demo02Anno {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }


    public void show2(){
        //替代show1方法
    }
}
