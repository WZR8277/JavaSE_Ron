package cn.zr.day06.demo05;



public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
        hero.setSkill(new SkillImpl());
        hero.attack();

        System.out.println("=============");
        Skill skill =new Skill() {
            @Override
            public void use() {
                System.out.println("pia pia pia");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        System.out.println("=============");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("pa pa pa");
            }
        });
        hero.attack();
    }
}
