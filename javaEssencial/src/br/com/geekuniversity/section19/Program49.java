package br.com.geekuniversity.section19;

import br.com.geekuniversity.section11.Account;
import br.com.geekuniversity.section11.Client;

import java.util.HashMap;
import java.util.Map;

public class Program49 {
    public static void main(String[] args) {
        Map<String, Account> accountMap = new HashMap<String, Account>();

        Client client1 = new Client(24, "Angelina Jolie", "Rua 1");
        Client client2 = new Client(24, "Felicity Jones", "Rua 2");

        Account account1 = new Account(1, 200, 300, client1);
        Account account2 = new Account(1, 200, 300, client2);

        accountMap.put("Physical Person", account1);
        accountMap.put("Legal Person", account2);
        accountMap.put("physical Person", account1);

        System.out.println(accountMap.size());

        System.out.println(accountMap.get("Physical Person"));
    }
}
