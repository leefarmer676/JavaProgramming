package Day14_String;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();

        scan.close();

        char firstChar = word.charAt(0);
        String result = "";

        if(firstChar >=0 && firstChar <=9){
            result = "first character is digit";
        }else if(firstChar >= 'a' && firstChar <= 'z'){
            result = "first character is lowercase";
        }else if(firstChar >= 'A' && firstChar <= 'Z'){
            result = "first character is uppercase";
        }else{
            result = "first character is special character";
        }



    }
}
