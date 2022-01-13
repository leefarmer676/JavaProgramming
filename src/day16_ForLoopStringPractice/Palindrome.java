package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Level";

        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println("isPalindrome = " + isPalindrome);

    }
}
