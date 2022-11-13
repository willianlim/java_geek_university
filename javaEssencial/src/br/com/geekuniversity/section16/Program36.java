package br.com.geekuniversity.section16;

public class Program36 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + (3 * 2);
        }

        for (int i = 0; i <= numbers.length; i++) {
            try {
                System.out.println(numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You are trying to access an array position does not exist.");
            } finally {
                System.out.println("Continue the process ...");
            }

        }
    }
}
