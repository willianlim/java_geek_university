package br.com.geekuniversity.section18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner input = new Scanner(new FileInputStream("input.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
