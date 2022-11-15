package br.com.geekuniversity.section19;

import br.com.geekuniversity.section11.Client;

import java.util.ArrayList;
import java.util.Collections;

public class Program47 {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<Client>();

        Client client1 = new Client(18, "Maria da Silva", "Rua 1");
        Client client2 = new Client(42, "Felicity Jones", "Rua 2");
        Client client3 = new Client(30, "Angelina Jolie", "Rua 3");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Collections.sort(clients);

        for (Client client: clients) {
            System.out.println(client);
        }
    }
}
