package day47_Polymorphism;

import Day44_AbstractionContinued.animalTask.Animal;
import Day44_AbstractionContinued.animalTask.Cat;
import Day44_AbstractionContinued.animalTask.Dog;
import day43_Abstraction.employeeTask.*;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Cube;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        //Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        //WebDriver driver = (ChromeDriver) new ChromeDriver();

        //Dog dog2 = new Dog("Max", "husky", 'M', 3, "small", "white");
        //Dog dog3 = dog2;

        Animal animal = new Dog("Max", "huskey", 'M', 3, "small", "white");

        Dog dog = (Dog)animal; //assign to variable if you need to use it more than once

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        //to be able to call unique methods of the dog:
        dog.bark();
        ((Dog) animal).bark(); //cannot be animal.bark(); -- this is without assigning to a variable (one time use)

        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide());//put downcasting into parentheses to prioritize it happening first

        System.out.println("-------------------------------");

        Animal animal2 = new Cat("Jim", "calico", 'F', 3, "small", "white");

        //how to call unique methods of the cat:
        //animal2.meow(); //cannot do this without casting
        Cat cat = (Cat) animal2; //do this if you need the variable to reuse
        //((Cat) animal2).meow(); --do this if you only need to use it once
        cat.meow();

        ((Dog)animal2).bark(); //this will throw ClassCastException because no IS A relationship
        //trying to cast cat to dog so it cannot happen

        System.out.println("--------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 10000);

        ( (Tester)employee ).bugReport();
        //( (Tester)employee ).unitTest();

        //( (Developer) employee ).unitTest(); //classCastException - no IS A relationship (since obj is Tester)

        //which one will be successful?
        //Driver driver = (Driver) employee; //line 1 //class cast exception bc tester cannot be cast into driver class
        //employee above is tester
        Person person = (Person) employee; //line 2 - upcasting there IS A relationship between tester and person
        //Teacher teacher = (Teacher) employee; //line 3 - tester doesn't have IS A relationship with teacher

        System.out.println("-------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        //((Cube)s1).volume();

            }
        }
