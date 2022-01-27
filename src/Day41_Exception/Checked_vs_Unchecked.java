package Day41_Exception;


import Day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(a/b); - division by zero
        //System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};

        //System.out.println(characters[99]); unchecked - array index out of bounds exception

        Student student = null; //null means that object was not created

        //System.out.println(student.getName()); unchecked - null pointer exception
        //bc student obj was not created, so you can't use instances of that object

        String str = "Wooden Spoon";

        str = null;

        //System.out.println(str.toUpperCase());//null pointer exception

        //checked exception:

        System.out.println("Hello");

        //Thread.sleep(3000); - interrupted exception

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file"); //file not found exception
        //all runtime exceptions are unchecked exceptions


    }
}
