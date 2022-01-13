package Day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt(); //each user entered input will be assigned to indexes of the array numbers
            //i is starting from first index, then stores them each 10 times in a row
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


        }

        /*
        3. Write a program that asks user to enter number 10 times
            1. store all user entered numbers into array
            2. find max number
            3. find min number
         */
    }

