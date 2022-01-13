package Day20_Arrays;

import java.util.Scanner;

public class AverageNumberOfArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        double averageNumber = sum/numbers.length;
        System.out.println("averageNumber = " + averageNumber);
    }

}
