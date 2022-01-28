package Day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException{
        System.out.println("Test started");

        System.out.println(8/0);//unchecked errors - throws keywords don't help
        //throws: used for handling checked exceptions only
        //only one way (try and catch) for handled unchecked exceptions

        System.out.println("Test completed");
    }
}
