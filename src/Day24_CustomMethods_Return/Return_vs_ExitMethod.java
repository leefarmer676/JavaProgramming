package Day24_CustomMethods_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {


    }
    public static void nameOfMonth(int month){

        if (month < 1 || month > 12) {
            System.out.println("Invalid");
            return; // exits nameOfMonth method
        }
        String name = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April"
                : (month == 5) ? "May" : (month == 6) ? "June" : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "Sept"
                : (month == 10) ? "Oct" : (month == 11) ? "Nov" : "Dec";


        System.out.println("Month name is " + name);
    }

}
