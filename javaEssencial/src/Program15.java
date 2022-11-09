/*
 * Math Operations
 */

public class Program15 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;

        // sum
        res = num1 + num2;
        System.out.println("The Sum of " + num1 + " + " + num2 + " é " + res);

        // subtraction
        res = num2 - num1;
        System.out.println("The subtraction of " + num2 + " - " + num1 + " é " + res);

        // multiplication
        res = num1 * num2;
        System.out.println("The multiplication of " + num1 + " * " + num2 + " é " + res);

        // integer division
        res = (num1 / num2);
        System.out.println("The division of " + num1 + " / " + num2 + " é " + res);

        // float division
        res2 = (float)num2 / (float)num1;
        System.out.println("The multiplication of " + num2 + " / " + num1 + " é " + res2);
    }
}
