package br.com.geekuniversity.section11;

public class Client extends Account {
    private String name;
    private String address;

    public Client(String name, String address) {
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
}
