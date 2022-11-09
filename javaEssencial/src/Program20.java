import java.util.Scanner;

public class Program20 {

    static String[] fruits;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int amount;

        System.out.println("Enter the amount of fruit to register: ");
        amount = Integer.parseInt(input.nextLine());

        register_data(amount);
        show_data(amount);
        input.close();
    }

    static void register_data(int amount) {
        fruits = new String[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the fruit " + (i + 1) + " : ");
            fruits[i] = input.nextLine();
        }
    }

    static void show_data(int amount) {
        for (int i = amount - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
    }
}
