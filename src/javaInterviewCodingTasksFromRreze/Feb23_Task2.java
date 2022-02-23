package javaInterviewCodingTasksFromRreze;

public class Feb23_Task2 {
    public static void main(String[] args) {


        String str = "abcde";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
