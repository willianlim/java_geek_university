package br.com.geekuniversity.section06;/*
 * Boolean types
 */

public class Program14 {

    public static void main(String[] args) {
        // primitives type
        boolean var1 = true;
        boolean var2 = false;

        // not primitives types
        Boolean var3 = true;
        Boolean var4 = false;

        boolean active = true;

        System.out.println("var1 " + var1);
        System.out.println("var2 " + var2);
        System.out.println("var3 " + var3);
        System.out.println("var4 " + var4);

        if (active) {
            System.out.println("Is true.");
        } else {
            System.out.println("It's fake.");
        }
    }
}
