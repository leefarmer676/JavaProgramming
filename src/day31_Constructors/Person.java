package day31_Constructors;

public class Person {
    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age){//1 constructor with 3 methods
        this.name = name;                           //don't need setInfo method with this
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
