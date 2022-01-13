package Day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void gather(){
        System.out.println(jobTitle + " " + name + " is gathering the requirements");
    }
}
