package b26_day58_exceptions.bank;

public class InvalidCredentialsException extends Exception{
    //this is a checked exception now because the parent is Exception class
    public InvalidCredentialsException(String msg){
        super(msg);
    }
}
