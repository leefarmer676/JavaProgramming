package Day15_Loop;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //googled smallest number you can provide as integer bc this will be smaller than any
        //number anyone can input
        //since this has to be the smallest, the first # they input will replace this number,
        //then the next number will be compared to the new "int max" and so on

        for (int i = 1; i <= 5 ; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();  //this is how you can get the number they type assigned to a variable
            if(num > max) {
                max = num;
            }

            }
        System.out.println("max = " + max);



        }

    }
