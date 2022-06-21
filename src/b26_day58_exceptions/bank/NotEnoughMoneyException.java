package b26_day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super("Not enough money in the account");
    }
    //overloaded constructor
    public NotEnoughMoneyException(String msg){
        super(msg);
    }
}

