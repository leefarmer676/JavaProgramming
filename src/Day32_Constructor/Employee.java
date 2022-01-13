package Day32_Constructor;

public class Employee {
    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //cannot use Employee(name); you have to use the "this." keyword with primitives
        //can use it this way above - using the this keyword with parentheses.
        this.gender = gender;
    }

    public Employee (String name, char gender, String jobTitle){
        this(name, gender);//can do this because we called them previously
        this.jobTitle = jobTitle;
    }

    public Employee (String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    /*
    public void method1(){

        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println(method1(););
    }
    */
}
