package Day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println("divisibleBy2 = " + divisibleBy2);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);

        System.out.println("-------------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is leap year: " + isLeapYear);



        /*number = 65

        65 is divisible by 2 = false
        by 3 = false
        by 5 = true

         */

    }
}
