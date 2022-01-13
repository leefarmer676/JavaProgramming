package Day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private  double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name); //this is how you do setInfo where it has to pass requirements in setName
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid name: " + name);
            System.exit(0);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16 || age>90){
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            return;
        }
        this.salary = salary;
    }
}
