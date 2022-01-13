package Day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;
        String result = "";

        if (n % 2 == 0) {
            result = "even";

        } else {
            result = "odd";

        }

        System.out.println("result = " + result);
        System.out.println("---------------");

        String result1 = (n%2 ==0)? "Even" : "Odd" ;

        System.out.println(result1);

        System.out.println("-------------------------");

        /*
        int age = 23;

        if (age >= 21) {
            System.out.println("Eligible"); //String
        }else{
            System.out.println("Not eligible"); //String
            */
         //in ternary you must return same type of value in every block
        //value you want to return, after the ?
        int age = 23;

        //System.out.println( (age >=21) ? "Eligible" : "Not eligible");

        String result2 = (age>=21) ? "Eligible" : "Not eligible";
        System.out.println(result2);

        //all 3 do the same exact thing - ternary is shorter

        System.out.println("----------------");
        //now with the else if statements

        int number = 100;
        //identify if it is positive, negative or zero

        /*
        if(number >0) {
            System.out.println("positive");
        }else if(number < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("zero"); //all returning same data type = string; every block must return one value
        */
        //else block is given using the colon

        //   ?=if block   :? = else if block - put the numbers in between the : and the ?     :=else block

        String result3 = (number>0)? "positive" :(number<0)? "negative" : "zero";

        System.out.println(result3);

        }
    }

