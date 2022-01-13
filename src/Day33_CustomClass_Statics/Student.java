package Day33_CustomClass_Statics;

public class Student {
    public String name;
    public char gender, grade;
    public int age;
    public long id;

    public Student(String name){
        this.name = name;
    }

    public Student (String name, char gender){
        this(name);
        this.gender = gender;
    }

    public Student(String name, long id){
        this(name);
        this.id = id;
    }

    public Student(String name, long id, char grade){
        this(name, id);
        this.grade = grade;
    }

    public Student (String name, char gender, int age){
        this(name, gender);
        this.age = age;
    }

    public Student (String name, char gender, int age, long id){
        this(name, gender, age);
        this.id = id;
    }

    public Student (String name, char gender, int age, long id, char grade){
        this(name, gender, age, id);
        this.grade = grade;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}
