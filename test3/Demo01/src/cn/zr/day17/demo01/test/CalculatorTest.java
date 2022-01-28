package cn.zr.day17.demo01.test;


import cn.zr.day17.demo01.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    //该方法用于资源申请 最开始执行
    @Before
    public void init(){
        System.out.println("init...");
    }
    //用于释放资源 最后执行
    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(1,2);
        //System.out.println(sum);
        Assert.assertEquals(3,sum);//断言 否则sout依然绿看不出结果对错
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int sub = calculator.sub(1,2);
        //System.out.println(sum);
        Assert.assertEquals(-1,sub);//断言 否则sout依然绿看不出结果对错
    }
}
