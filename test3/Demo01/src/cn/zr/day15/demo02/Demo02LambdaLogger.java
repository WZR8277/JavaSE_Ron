package cn.zr.day15.demo02;

public class Demo02LambdaLogger {
    public static void main(String[] args) {

        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1,()->{
            return msg1+msg2+msg3;
        });
    }

    private static void showLog(int level, MessageBuilder mb) {

        if (level==1){
            System.out.println(mb.builderMessage());//不执行 字符串不拼接 lambda表达式的延迟执行
        }
    }
}
