package br.com.geekuniversity.section07;/*
 * Vectors part 2
 */

public class Program17 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.println("Vector size: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 3;
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)Math.round(Math.random() * 10);
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
