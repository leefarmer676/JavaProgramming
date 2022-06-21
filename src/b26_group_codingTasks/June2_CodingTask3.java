package b26_group_codingTasks;
/*
3) String - sum of digits in a string
Write a method that can return the sum of the digits in a string

 */
public class June2_CodingTask3 {
    public static void sumOfDigits(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int eachChar = (str.charAt(i)-'0');
            result += eachChar;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        sumOfDigits("1234");
    }
}
