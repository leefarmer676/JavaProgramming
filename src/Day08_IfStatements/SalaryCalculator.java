package Day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 30,
            weeklyHours = 40;
        double overTime = hourlyRate * 1.5;
        double overTimeSalary = 144 * overTime;

        double stateTaxRate = 5.4,
        federalTaxRate = 22;

        //----------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52 + overTimeSalary;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;//federal tax equation is same formula
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("State tax = $ " + stateTax);
        System.out.println("Net income = $" + salaryAfterTax);




    }
}
