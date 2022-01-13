package Day30_CustomClass;

public class Dog {

    public String name; //only create; don't initialize it when you create it
    public int age;
    public char gender;
    public String breed; //need different copies bc there are different breeds -- instance variable
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    //static keyword means there will only be one copy
    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    //public String toString(){//now that there's a String method in this class, it will no longer print hashcode
      //  return "Name: " + name;//will need this in all custom classes I create from now on
        //IntelliJ provides shortcut - right click, Generate, toString(), uncheck insert @override, select all
    }

/*
Attributes:
    name, age, gender, breed, size, color (data that I want to be able to store for each dog)

Actions:
    eat(), play(), bark().....
if you want to have each objoect to have different data for the attributes and actions (fields), then
make sure they have a different copy
 */
