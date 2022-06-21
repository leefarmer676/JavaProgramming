package b26_day58_exceptions.bank;

public class Bank {
    //unchecked exception first
    double balance;

    public void withdraw(double amountToTakeOut){

        if(amountToTakeOut>balance){
            //with overloaded constructor now I can choose to write a message here - including actual balance
            throw new NotEnoughMoneyException("Balance only has " + balance);
        }
        balance-= amountToTakeOut;
    }
    //in this method we throw checked exceptions, and so they must be handled
    //we created the class, so we don't want to handle it - used throws in method signature line
    // to allow program to compile so user of the class has to handle

    public void login(String username, String password) throws InvalidCredentialsException{
        if(!username.equals("jamesbond")){
            //creating a new object (the object is the exception)
            throw new InvalidCredentialsException("Invalid username");
        }
        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }
        System.out.println("Login Successful");
    }

}
