package Day34_GarbageCollection_AccessModifiers;
import static Day34_GarbageCollection_AccessModifiers.Circle.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);//0.0
        System.out.println(Circle.name);//null
        System.out.println(Circle.numbers);//default values are printing bc main method can't be executed outside of circle class

//this will show up with the correct variables if they are stored in the static block in class Circles
        //main method in one class cannot be automatically executed in another class
        //static class executes automatically when you call something from that class

        System.out.println("---------------------------");

        //find the sum of 10, 20

        //find the sum of 100, 200
    }
}
