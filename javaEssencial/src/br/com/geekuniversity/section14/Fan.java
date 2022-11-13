package br.com.geekuniversity.section14;

public class Fan implements IElectronic{
    private boolean turnOn = false;

    public Fan() {

    }

    @Override
    public void turnOn() {
        if (!this.turnOn) {
            this.turnOn = true;
            System.out.println("I turned on the device");
        }
    }

    @Override
    public void turnOff() {
        if (this.turnOn) {
            this.turnOn = false;
            System.out.println("I turned off the device");
        }
    }
}
