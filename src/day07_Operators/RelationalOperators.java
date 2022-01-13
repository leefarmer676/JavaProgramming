package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20 > 40; //false

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //true

        //apply for a loan - credit score of 720

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int x = 100;
        int y = 200;

        boolean equal = x == y;
        System.out.println("equal = " + equal); //false

        boolean result8 = "Muhtar" == "Good Guy"; //false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' != 'a'; //true (not equal)
        System.out.println("result9 = " + result9);





    }
}
