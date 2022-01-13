package Day13_String;

import java.util.Scanner;

public class Day13PracticeTasks1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        scan.close();

        char firstChar = sentence.charAt(0);
        char secondChar = sentence.charAt(sentence.length() - 1);

        String result = firstChar + " " + secondChar;
        System.out.println(result);

    }
}
