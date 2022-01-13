package Day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //shortcut - right click, hit generate, select all variables (using ctrl and click, or ctrl and a), click ok
    //then delete the class name ("Student") and give return type, void, then name it setInfo
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

        //with "this" word, you can name these variables the same as the local variable
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep (){
        System.out.println(name + " is sleeping");
    }
}
