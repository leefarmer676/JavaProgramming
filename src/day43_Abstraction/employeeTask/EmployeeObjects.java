package day43_Abstraction.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M'); - compile error bc Person class is abstract

        Developer developer = new Developer("Ali", 40, 'F', 34, "QA", 130000);
        Tester tester = new Tester("Brooke", 34, 'F', 23, "Science Teacher", 45000);

        System.out.println(developer);
        System.out.println(tester);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------");

        developer.work();
        developer.sleep();
        //developer.bugReport(); bug report is unique method for testers; cannot call with developer object
        developer.eat();
        developer.unitTest();
    }
}
