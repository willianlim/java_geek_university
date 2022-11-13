package br.com.geekuniversity.section16;

import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inform the number 1: ");
        int number1 = input.nextInt();

        System.out.println("Inform the number 2: ");
        int number2 = input.nextInt();

        try {
            System.out.println(division(number1, number2));
        } catch (Exception e) {
            System.out.println("Unable to execute the split.");
        }


        input.close();
    }

    public static int division(int n1, int n2) throws Exception{
        return (n1 / n2);
    }
}
