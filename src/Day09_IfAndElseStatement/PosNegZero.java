package Day09_IfAndElseStatement;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");

        }
        System.out.println("=-----------------------------");

        if (positive){
            System.out.println("Positive");
        }
        if (negative) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");//this will print positive and then zero because it's one if statement and one if else staement, 2 answers

        }


    }



}
