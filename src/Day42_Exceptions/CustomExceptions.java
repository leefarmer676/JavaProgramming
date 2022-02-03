package Day42_Exceptions;

class FadyException extends RuntimeException{//custom unchecked exception
    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}

class NoBreakException extends Exception{ //custom checekd exception

}

public class CustomExceptions {
    //custom unchecked exception
    public static void main(String[] args) {
        //throw new FadyException("It's time for lunch");//only doesn't have error bc extends RubTimeException

        try {
            throw new NoBreakException(); //error bc this is a checked exception
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
