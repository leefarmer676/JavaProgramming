package Day15_Loop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {


        double sum = 0; //when you need to find sum of multiple numbers always start with 0
        //because if you add anything to zero, it is that number

        for (int i = 0; i < 101; i++) {
            sum += i; //will add each number it gets into the sum

        }
        System.out.println(sum);

        System.out.println("---------------------");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter a number:");
            total += scan.nextInt();


        }

        System.out.println("total = " + total);

        scan.close();



    }
}
