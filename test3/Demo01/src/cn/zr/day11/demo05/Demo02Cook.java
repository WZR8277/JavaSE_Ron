package cn.zr.day11.demo05;

public class Demo02Cook {
    public static void main(String[] args) {

        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        invokeCook(()->{
            System.out.println("吃饭了");
        });
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }


}
