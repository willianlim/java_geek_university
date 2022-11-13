package br.com.geekuniversity.section17;

import br.com.geekuniversity.section11.Account;
import br.com.geekuniversity.section11.Client;

import java.util.Scanner;

public class Main {
    static Client client = new Client("Angelina Jolie", "Rua da paz, 45");
    static Account account = new Account(1, 200, 300, client);
    static Scanner input = new Scanner(System.in);

    public static void deposit() {
        System.out.println("=========== DEPOSIT ===========");
        System.out.println("Enter the deposit amount: ");
        float value = input.nextFloat();
        if (value > 0) {
            account.deposit(value);
            System.out.println("Deposit made successfully.");
        } else {
            System.out.println("The value must be positive.");
        }
    }

    public static void withdraw() {
        System.out.println("=========== WITHDRAW ===========");
        System.out.println("Enter the withdrawal amount: ");
        float value = input.nextFloat();
        if (value > 0) {
            account.withdraw(value);
        } else {
            System.out.println("The value must be positive.");
        }
    }

    public static void consult() {
        System.out.println("Your balance is " + account.getBalance());
    }

    public static void main(String[] args) {
        int option = 0;
        System.out.println("Welcome to Geek bank.");

        do {
            System.out.println("Select an option below: ");
            System.out.println("1 - Deposit.");
            System.out.println("2 - Withdraw.");
            System.out.println("3 - Consult balance.");
            System.out.println("0 - Exit.");
            option = input.nextInt();

            switch (option) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    consult();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (option > 0);
        input.close();
    }
}
