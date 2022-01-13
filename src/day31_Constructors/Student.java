package day31_Constructors;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int id;

    //shortcut to use a constructor instead of setInfo method- generate, constructor,
    // select instances you want to set as a constructor


    public Student(String name, int age, char gender, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
