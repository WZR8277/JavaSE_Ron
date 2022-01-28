package cn.zr.day03.demo06;

public class User {
    private String name;
    private int money;

    public void show(){
        System.out.println("my name is: "+name+" i have :"+money);
    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
