package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        int number = 5;

        String result = (number >= 0 && number <= 7) ? (number >= 7) ? "Seven" : (number >= 6) ? "Six" : (number >= 5) ? "Five"
                : (number >= 4) ? "Four" : (number >= 3) ? "Three" : (number >= 2) ? "Two" : (number >= 1) ? "One"
                : "Zero" : "Invalid number";
        System.out.println(result);

    }
}
