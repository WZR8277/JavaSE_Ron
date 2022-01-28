package cn.zr.day03.demo06;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员1",0);
        Member member3 = new Member("成员1",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("==================");

        ArrayList<Integer> redlist = manager.send(20,3);
        member1.receive(redlist);
        member2.receive(redlist);
        member3.receive(redlist);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
