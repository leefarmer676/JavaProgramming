package day01_JavaPractice;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) { //tells starting length to be the last index/character
            reverse += "" + str.charAt(i);

        }
        System.out.print(reverse);

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome");

        }else{
            System.out.println("not a palindrome");
        }
    }
}
