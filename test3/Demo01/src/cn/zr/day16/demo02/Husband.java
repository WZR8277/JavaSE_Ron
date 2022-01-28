package cn.zr.day16.demo02;

public class Husband {
    public void buyHouse(){
        System.out.println("在北京买房");
    }

    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
/*        marry(()->{
            this.buyHouse();
        });*/
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
