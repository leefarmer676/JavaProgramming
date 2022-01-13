package Day15_Loop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        String str = "xcodeX";

        str = str.replace("x", "a").replace("X", "a");

        System.out.println("str = " + str);

    }
}
