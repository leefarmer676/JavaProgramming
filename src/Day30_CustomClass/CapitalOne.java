package Day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 2237, 'M', 25, "Dev", 100000, true);
        employee2.setInfo("John", 2237, 'M', 25, "Dev", 100000, true);
        employee3.setInfo("John", 2237, 'M', 25, "Dev", 100000, true);
        employee4.setInfo("John", 2237, 'M', 25, "Dev", 100000, true);
        employee5.setInfo("John", 2237, 'M', 25, "Dev", 100000, true);

        Employee [] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < min){
                min = employee.salary;
            }
        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}