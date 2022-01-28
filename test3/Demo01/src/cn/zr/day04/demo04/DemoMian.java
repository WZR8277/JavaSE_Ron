package cn.zr.day04.demo04;

public class DemoMian {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.useDevice(new Mouse());

        computer.powerOff();
    }
}
