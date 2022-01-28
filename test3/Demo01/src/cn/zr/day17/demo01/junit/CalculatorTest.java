package cn.zr.day17.demo01.junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1,2);
        System.out.println(sum);
    }
}
