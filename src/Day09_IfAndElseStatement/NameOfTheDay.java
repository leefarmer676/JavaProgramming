package Day09_IfAndElseStatement;

public class NameOfTheDay {
    public static void main(String[] args) {

        int n = 5; //pre-condition; number between 1 and 7 (1~7)
        String day;
        if(n==1){
            //System.out.println("Monday");
            day = "Monday";
        }else if(n == 2){
            //System.out.println("Tuesday");
            day = "Tuesday";
        }else if(n==3){
            //System.out.println("Wednesday");
            day = "Wednesday";
        }else if(n==4){
            //System.out.println("Thursday");
            day = "Thursday";
        }else if(n==5){
            //System.out.println("Friday");
            day = "Friday";
        }else if(n==6){
            //System.out.println("Saturday");
            day = "Saturday";
        }else {
            //System.out.println("Sunday");
            day = "Sunday";
            //}else{
            //System.out.println("Invalid"); this works but it's not the efficient way
            //creating a pre-condition is much more efficient, i.e. only 1-7 numbers
        }
            System.out.println("day = " + day);

        }
    }

