package br.com.geekuniversity.section11;

public class Program27 {
    public static void main(String[] args) {
        Client client = new Client("Felicity Jones", "Rua algo, 123");

        System.out.println("Name: " + client.getName());
        System.out.println("Address: " + client.getAddress());

        Client client1 = new Client("Angelina Jolie", "Rua oi");

        System.out.println("Name: " + client1.getName());
        System.out.println("Address: " + client1.getAddress());
    }
}
