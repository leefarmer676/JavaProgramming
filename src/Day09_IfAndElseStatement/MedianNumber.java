package Day09_IfAndElseStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        boolean bIsMedian = (a > b && b > c) || (c > b && a < b);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) { //if a is the median number
            System.out.println(a+ " is median number");

        }
        if (bIsMedian) {
            System.out.println(b + " is median number");

        }

        if (cIsMedian) {
            System.out.println(c + " is median number");

        }
    }
}


        /* 2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

         */


