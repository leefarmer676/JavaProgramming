package Day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 105;

        /*if (score >= 0 && score <= 100) {

            if (score >= 90) {
                result = "A"; //this is the benefit of using a temporary variable String result (less print statements)
            } else if (score >= 80) {
                System.out.println("B");
            }

        } else {
            System.out.println("Invalid score");

        }

         */

        System.out.println("------------------");
//solution 2: using ternaries only
        String result = "";
        result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                :(score>=60)? "Passed"  : "Failed" : "Invalid Score";
        System.out.println(result);

    }
}
