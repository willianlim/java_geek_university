package br.com.geekuniversity.section15;

public class Program35 {
    public static void main(String[] args) {
        Account account1 = new Account("My client");
        System.out.println("Number of account: " + account1.getNumber());
        System.out.println("Client: " + account1.getClient());

        System.out.println("The next account will be: " + Account.nextAccount());
    }
}
