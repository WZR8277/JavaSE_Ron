package cn.zr.day10.demo02;

public class Demo02Sleep {
    public static void main(String[] args) {
        for (int i = 0; i <60; i++) {
            System.out.println(i+1);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
