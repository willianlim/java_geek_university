package br.com.geekuniversity.section19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program48 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();

        Scanner input = new Scanner(System.in);
        boolean res;

        for (int i = 0; i < 5; i++) {
            System.out.println("Inform the " + (1 + i) + "/5 name: ");
            String name = input.nextLine();
            res = names.add(name);
            if (!res) {
                System.out.println("The cannot be repeated.");
                i--;
            }
        }
        System.out.println("In the name set we have " + names.size() + " elements");
        for (String name: names) {
            System.out.println(name);
        }
        input.close();
    }
}
