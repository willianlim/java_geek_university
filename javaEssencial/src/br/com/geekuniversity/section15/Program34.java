package br.com.geekuniversity.section15;

public class Program34 {
    public static void main(String[] args) {
        Account account1 = new Account("Angelina Jolie");
        System.out.println(account1.getNumber());
        System.out.println(account1.getClient());

        Account account2 = new Account("Felicity Jones");
        System.out.println(account2.getNumber());
        System.out.println(account2.getClient());

        Account account3 = new Account("Felicity Jones");
        System.out.println(account3.getNumber());
        System.out.println(account3.getClient());

        System.out.println(account1.counter);
        System.out.println(account2.counter);
        System.out.println(account3.counter);
        System.out.println(Account.counter);
    }
}
