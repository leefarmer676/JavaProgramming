package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligibleToVote = age >=18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligibleToVote);

        System.out.println("-------------------------");

        String name2 = "Josh";

        int creditScore = 800;
        int age2 = 42;
        int income = 40000;

        boolean isEligibleForLoan = age >= 21 && creditScore >= 700 && income >= 60000;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan);

        System.out.println("-------------------------------");

        String name3 = "Shay";

        int age3 = 23;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println("isEligible3 = " + isEligible3);

        System.out.println("------------------------");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        System.out.println("-------------------------");

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <=60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        int score = 50;
        boolean pass = score >= 60;
        boolean fail = !pass;

        System.out.println("pass = " + pass);
        System.out.println("fail = " + fail);









    }
}
