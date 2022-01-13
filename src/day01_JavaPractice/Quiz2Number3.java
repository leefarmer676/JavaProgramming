package day01_JavaPractice;

public class Quiz2Number3 {
    public static void main(String[] args) {

        char grade = 'A';
        boolean Passed = grade == 'A' || grade =='B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if (Passed||Passed2) {
            System.out.println("You've passed the exam");
        }else{
            System.out.println("You failed");
        }


    }
}
