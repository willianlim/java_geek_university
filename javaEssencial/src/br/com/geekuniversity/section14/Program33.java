package br.com.geekuniversity.section14;

public class Program33 {
    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println("The fan brand is: " + fan.BRAND);
        fan.turnOff();
        fan.turnOn();
        fan.turnOff();
    }
}
