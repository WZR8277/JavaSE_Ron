package cn.zr.day06.demo01;

public class Body {

    private String name;

    public class Heart{

        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫："+name);
        }

    }

    public void methodBody(){
        System.out.println("外部类方法");

        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
