package br.com.geekuniversity.section18;

import br.com.geekuniversity.section11.Account;
import br.com.geekuniversity.section11.Client;

public class Program39 {
    public static void main(String[] args) {
        Client client1 = new Client("Angelina Jolie", "Rua 1, 234");
        Client client2 = new Client("Felicity Jones", "Rua 2, 345");

        Account account1 = new Account(1, 200, 300, client1);
        Account account2 = new Account(1, 200, 300, client2);

        Box shelf = new Box();

        System.out.println(account1);
        System.out.println(account2);

        if (account1.equals(account2)) {
            System.out.println("They are the same account.");
        } else {
            System.out.println("Are different accounts.");
        }

        shelf.add(account1);
        shelf.add(account2);

//        Account account3 = shelf.take(0);

        System.out.println(((Account)shelf.take(0)).getBalance());
        shelf.add(client1);
        System.out.println(((Client)shelf.take(2)).getName());

        if (account1 instanceof Account) {
            System.out.println("The object is of type Account");
        }
    }
}
