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
}
