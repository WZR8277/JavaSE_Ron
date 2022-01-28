package cn.zr.day10.demo01;
//extends Exception必须处理 extend runtimeException可以不处理
public class RegisterException extends Exception{
    public RegisterException(){

    }
    public RegisterException(String msg){
        super(msg);
    }
}
