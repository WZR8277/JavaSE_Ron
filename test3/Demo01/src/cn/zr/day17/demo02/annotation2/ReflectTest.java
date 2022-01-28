package cn.zr.day17.demo02.annotation2;


@Pro(className = "cn.zr.day17.demo02.annotation2.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*

            public class ProImpl implements Pro{
                public String className(){
                    return "cn.zr.day17.demo02.annotation2.Demo1";
                }
                public String methodName(){
                    return "show";
                }

            }
 */

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

    }
}
