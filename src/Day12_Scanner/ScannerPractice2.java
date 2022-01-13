package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter true/false:");
        //boolean result = scan.nextBoolean();

        System.out.println("Enter your name:");
        String name = scan.next(); //Java Programming - if you type this in, it will only read Java, bc space after it
        //next only reads input until the first space

        System.out.println("name = " + name); //Java

        scan.close();


    }
}
