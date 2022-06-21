package b26_day58_exceptions.bank;

import java.util.Arrays;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);
       // accountOne.withdraw(2000);
        //System.out.println(accountOne.balance);

        //must handle this even if the username and password is correct
        //have to handle in order to run bc it's a checked exception
        try {
            accountOne.login("james", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }


        int[]intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));

        int[]num1 = new int[3];
        System.out.println(Arrays.toString(num1));
        int[]num2 = {1,2,3,4};
        num1 = num2;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }
}
