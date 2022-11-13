package br.com.geekuniversity.section16;

import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number for division.");
        int number1 = input.nextInt();

        System.out.println("Enter the second number for division: ");
        int number2 = input.nextInt();

        try {
            System.out.println("The division of " + number1 + " by "+ number2 + " is " + number1/number2);
        } catch (ArithmeticException e) {
            System.out.println("There is no division by 0.");
        }
        input.close();
    }
}
