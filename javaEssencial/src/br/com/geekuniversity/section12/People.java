package br.com.geekuniversity.section12;

public class People {
    private String name;
    private int birthDate;
    private String email;

    public People() {}

    public People(String name, int birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return (this.birthDate);
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return (this.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return ("Name: " + this.name + "\nBirth Date: " + this.birthDate);
    }

    public void message() {
        System.out.println("This is my message ...");
    }

    public void message(String msg) {
        System.out.println(msg);
    }

    public void message(String msg, int num) {
        System.out.println(msg + num);
    }
}
