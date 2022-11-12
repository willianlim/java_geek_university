package br.com.geekuniversity.section12;

public class Student extends People {
    private String ra;

    public Student(String name, int birthDate, String email, String ra) {
        super(name, birthDate, email);
        this.ra = ra;
    }

    public String getRa() {
        return (this.ra);
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String toString() {
        return (super.toString() + "\nR.A: " + this.ra);
    }

    @Override
    public void another_message(String text) {
        System.out.println(text);
    }

    public String getName() {
        return ("Student: " + super.getName());
    }
}
