package Day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers; //= new ArrayList<>();
    //numbers.add(10); -- need to use static block bc it requires multiple steps to set it

    public Circle(double radius){
        this.radius = radius;
        //pi = 3.14; don't use a constructor to set a static variable; use the static block
    }
    static{
        pi=3.14;
        name = "circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20); //this can only be done in the static block bc you're in a block, so you can add numbers
    }

    public static void main(String[] args) { //if the main method doesn't get executed, these static variables are not set
        //you can't call it in another class
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }
}
