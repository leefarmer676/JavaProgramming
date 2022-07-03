package ReplitPractice;

public class PrintFirstAndLast {
    public static void main(String[] args) {


        String word = "adobe";
        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length()-1);
        String firstAndLast = firstLetter + lastLetter;
        System.out.println("firstAndLast = " + firstAndLast);
    }
}
