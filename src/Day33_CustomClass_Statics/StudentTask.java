package Day33_CustomClass_Statics;

class StudentClass{
    public String name;
    public char gender, grade;
    public int age;
    public long id;

    public StudentClass(String name){
        this.name = name;
    }

    public StudentClass (String name, char gender){
        this(name);
        this.gender = gender;
    }

    public StudentClass(String name, long id){
        this(name);
        this.id = id;
    }

    public StudentClass(String name, long id, char grade){
        this(name, id);
        this.grade = grade;
    }

    public StudentClass (String name, char gender, int age){
        this(name, gender);
        this.age = age;
    }

    public StudentClass (String name, char gender, int age, long id){
        this(name, gender, age);
        this.id = id;
    }

    public StudentClass (String name, char gender, int age, long id, char grade){
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

class Test{


}

public class StudentTask {


}
