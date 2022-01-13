package Day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }
}
//didn't finish this because day 35 has another example that's almost exactly the same stuff