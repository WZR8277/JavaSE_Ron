package cn.zr.day16.demo02;

public class Demo02ObjectMethodReference {
    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpperCaseString(s);
        });

        MethodRerObject methodRerObject = new MethodRerObject();
        printString(methodRerObject::printUpperCaseString);
    }
    public static void printString(Printable p){
        p.print("hello");
    }
}
