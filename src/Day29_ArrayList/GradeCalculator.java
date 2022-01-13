package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,36,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); //90-100
        gradeOfA.removeIf(p-> !(p>=90 && p<=100));
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>=80 && p <=89));
        System.out.println(gradeOfB);

        System.out.println("Total number of a: " + gradeOfA.size());
//solution with a loop is shared on GitHub
        /*
        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);

         */



    }
}
