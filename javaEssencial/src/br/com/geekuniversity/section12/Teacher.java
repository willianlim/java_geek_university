package br.com.geekuniversity.section12;

public class Teacher extends People{
    private String registration;

    public Teacher(String name, int birthDate, String email, String registration) {
        super(name, birthDate, email);
        this.registration = registration;
    }

    public String getRegistration() {
        return (this.registration);
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String toString() {
        return (super.toString() + "\nRegistration: " + this.registration);
    }

    @Override
    public void another_message(String text) {
        System.out.println(text);
    }

    public String getName() {
        return ("Teacher: " + super.getName());
    }
}
