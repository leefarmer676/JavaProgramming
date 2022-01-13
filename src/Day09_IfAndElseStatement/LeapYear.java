package Day09_IfAndElseStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear){

            System.out.println("Year " + year +" is leap year");
        }

        if (!leapYear){
            System.out.println("Year " + year + " is not leap year");
        }

        System.out.println("---------------------------");

        if (leapYear) {
            System.out.println("Year " + year + " is leap year");
        }else{
            System.out.println("Year " + year + " is NOT leap year"); //this is better bc if you use two if statements, compiler will check both; with if else, then it doesn't have to do as much work
            //compiler skips else statement if first if statement is first, so it's less work
        }
    }
}
