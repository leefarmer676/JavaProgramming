package Day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;
        boolean isOdd = number % 2 != 0;

        if (isOdd) {
            System.out.println(number + " is odd");
        } else {
            System.out.println(number + " is even");
        }

        System.out.println("-------------------------");

        int n = -10;

        boolean isNegative = n < 0,
                isPositive = n > 0,
                isZero = n == 0;

        if (isNegative) {
            System.out.println(n + " is negative");
        }
            if (isPositive) {
                System.out.println(n + " is positive");

            }
            if(isZero){
                System.out.println(n + " is zero");

            }

        }
    }


