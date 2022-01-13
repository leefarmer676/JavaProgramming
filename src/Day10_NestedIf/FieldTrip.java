package Day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 3;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if(grade >=1 && grade<=6){
            if (grade ==1){
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Mrs. Smith";
            }else if(grade ==2){
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if(grade == 3){
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }else if (grade ==4){
                location = "grade 4";
                groupNumber = 4;
                teacher = "grade 4 teacher";
            }
        }else {
            System.out.println("Invalid");

        }
            System.out.println("location = " + location);
            System.out.println("groupNumber = " + groupNumber);
            System.out.println("teacher = " + teacher);


    }
}
