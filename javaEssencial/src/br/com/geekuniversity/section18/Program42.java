package br.com.geekuniversity.section18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            PrintStream write = new PrintStream("exit.txt");
            for (int i = 0; i < 5; i++) {
                System.out.println("Writhe something: ");
                String msg = input.nextLine();
                write.println(msg);
            }
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("could not create file.");
        }
        input.close();
    }
}
