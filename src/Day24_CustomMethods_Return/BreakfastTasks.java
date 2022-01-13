package Day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Cydeo", "School");
        emailDomain("lee.farmer0208@gmail.com");
        System.out.println("-------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };
        for (String email : emails) {
            emailDomain(email);
        }
        nameOfMonth(2);
        nameOfDay(6);
        daysInMonth(3);
    }

    //create a method that can display the initials of the person
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    //create a method that can display the domain of an email
    public static void emailDomain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //create a method that can display the name of the month based on teh given number to the method
    public static void nameOfMonth(int month) {
        String name = "";
        if (month >= 1 && month <= 12) {
            name = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April"
                    : (month == 5) ? "May" : (month == 6) ? "June" : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "Sept"
                    : (month == 10) ? "Oct" : (month == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name is " + name);
    }

    //create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        String day = "";
        if (number >= 1 && number <= 7) {
            day = (number == 1) ? "Mon" : (number == 2) ? "Tues" : (number == 3) ? "Wed" : (number == 4) ? "Thurs"
                    : (number == 5) ? "Fri" : (number == 6) ? "Sat" : "Sun";

        } else {
            System.out.println("Invalid number");
        }
        System.out.println("Day of week is " + day);

    }

    //create a method that can print how many days a month has
    public static void daysInMonth ( int number){
    if(number >= 1 && number <= 12){
        int days = (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 ||
                number == 10 || number == 12)? 31 :(number == 2)? 28 : 30;
        System.out.println("This month has " + days + " days in the month");
    }else{
        System.out.println("Invalid number");
    }
        }
    }



