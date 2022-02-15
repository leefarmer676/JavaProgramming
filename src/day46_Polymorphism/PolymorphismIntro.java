package day46_Polymorphism;

import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Square;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;
        Double n2 = 5.5;

        Boolean r1 = true;

        Object [] array = {str, n1, n2, r1, new Circle(4), new Square(12)}; //can store all of them because Object is parent of all the above classes

        /*
        datatype of instance variable type

        WebDriver driver; -- WebDriver is interface; is relationship between driver and all the classes

        driver = new ChromeDriver();

        driver = new FireFoxDriver();
         */
    }
}
