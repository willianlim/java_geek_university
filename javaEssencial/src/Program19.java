/**
 * Matrices part 2
 */

public class Program19 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 3;
        numbers[0][2] = 5;
        numbers[1][0] = 7;
        numbers[1][1] = 9;
        numbers[1][2] = 11;
        numbers[2][0] = 13;
        numbers[2][1] = 15;
        numbers[2][2] = 17;

        System.out.println(numbers[1][2]);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i + j * 2;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("Numbers[" + i + "][" + j + "] = " + numbers[i][j]);
            }
        }
    }
}
