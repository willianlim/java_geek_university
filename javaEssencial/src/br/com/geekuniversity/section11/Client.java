package br.com.geekuniversity.section11;

import java.util.Objects;

public class Client extends Account implements Comparable {
    private int age;
    private String name;
    private String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
        this.say_hello();
    }

    public Client(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.say_hello();
    }

    private void say_hello() {
        System.out.println(this.name + " Say Hello ...");
    }

    public String getName() {
        return (this.name);
    }

    public String getAddress() {
        return (this.address);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object other) {
        Client aux = (Client) other;
        if (this.age < aux.age) {
            return (-1);
        } else if (this.age > aux.age) {
            return (1);
        }
        return (0);
    }
}
