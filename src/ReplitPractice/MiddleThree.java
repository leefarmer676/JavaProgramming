package ReplitPractice;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        int num = word.length();
        if(num >= 5 && num % 2 == 1){
            System.out.println(word.substring(word.length()/2 - 1, word.length()/2 + 2));
        } else {
            System.out.println("invalid");
        }

    }
}
