package Day09_IfAndElseStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        int n = 1;

        String month;

        boolean days28 = n==2;
        boolean days30 = n == 4 || n==6 || n==9 || n==11;
        boolean days31 = !days28 && !days30;

        if (days28){
            System.out.println("This month has 28 days");
        }
        if (days30){
            System.out.println("This month has 30 days");
        }else{
            System.out.println("This month has 31 days");
        }


    }



}
