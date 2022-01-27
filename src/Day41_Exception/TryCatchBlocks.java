package Day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        }catch(ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Arithmetic exception is caught");
        }
        System.out.println("Test1 completed");

        System.out.println("Test2 started");

        int [] numbers = {1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        }catch(RuntimeException e){ //parent class of all exceptions that IntelliJ doesn't catch until runtime
            //e.printStackTrace();//preferred method to put in runtime exception block
            System.out.println(e.getMessage());//prints "Index 200 out of bounds for length 5" - not preferred
            System.out.println("Catch Block");//don't use parent exception class bc it checks too many things
            System.out.println("Null Pointer exception occurred"); //null pointer exception didn't work

        }

        System.out.println("Test2 Completed");

        System.out.println("---------------------------");

        System.out.println("Test 3 started");

        try {
            //System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test 4 completed");

        System.out.println("-----------------------");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Cydeo");
        System.out.println("-----------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
