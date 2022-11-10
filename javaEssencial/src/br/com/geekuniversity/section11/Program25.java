package br.com.geekuniversity.section11;

public class Program25 {
    public static void main(String[] args) {
        Client joao = new Client("Joao da Silva", "Rua da paz, 45");
        Client maria = new Client("Maria da Silva", "Rua da paz, 45");

        Account account_joao = new Account(1, 100.0f, 200.0f, joao);
        Account account_maria = new Account(2, 300.0f, 500.0f, maria);

        System.out.println("Balance of joao (before the loot): " + account_joao.getBalance());
        System.out.println("Balance of maria: " + account_maria.getBalance());

        account_joao.withdraw(150);
        System.out.println("Balance of joao: " + account_joao.getBalance());
    }
}
