package br.com.geekuniversity.section18;

public class Program41 {
    public static void main(String[] args) {
        String curse = "Java programming: Essential";

        curse = curse.replace("Java", "Python");
        System.out.println(curse);

        curse = curse.toLowerCase();
        System.out.println(curse);

        curse = curse.toUpperCase();
        System.out.println(curse);

        System.out.println(curse.charAt(0));

        for (int i = 0; i < curse.length(); i++) {
            System.out.print(curse.charAt(i));
        }
        System.out.println();
        for (int i = (curse.length() - 1); i >= 0; i--) {
            System.out.print(curse.charAt(i));
        }
    }
}
