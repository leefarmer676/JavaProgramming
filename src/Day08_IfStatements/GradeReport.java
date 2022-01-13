package Day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 55;

        boolean a = score >= 90 && score <= 100,
                b = score >= 80 && !a,          //another way to write it
                c = score >= 70 && score <= 79,
                d = score >= 60 && score <= 69,
                f = !a && !b && !c && !d;

        if(a) {   //if the student made an a
            System.out.println("Excellent");
        }

        if (b) {
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }



    }
}
