package Day39_Recap.cydeoTask;

public class Developer extends Employee{
    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName()+ " is fixing bugs");
    }

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is working as developer");
    }
}
