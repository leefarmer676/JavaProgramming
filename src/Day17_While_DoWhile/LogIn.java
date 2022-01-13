package Day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String u = scan.next();

        System.out.println("please enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts = 3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0){
                System.err.println("Incorrect username or passowrd, please re-enter");
                System.out.println("Enter your username");
                u = scan.next();


                System.out.println("Enter oyoru passwrod");
                p=scan.next();
                attempts--;
            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("logged in");
            }else{
                System.out.println("Your account is locked");
            }

        }
        scan.close();
        //username: "Cydeo"
        //password: "Cydeo123"

        int attempt = 3; //every time they do an invalid, then this decreases by 1

        //while(invalid && hasAttempts left)


    }
}
