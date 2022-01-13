package Day15_Loop;

import java.util.Scanner;

public class SumOfAllEvenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.nextLine();

        int sum = 0;
        
        for (int i = 0; i <= input; i++) {
            sum += i;
            
        }
        System.out.println("sum = " + sum);
    }
}
