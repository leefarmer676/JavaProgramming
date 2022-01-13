package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println(word); //Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word); //what word you get depends on where you place your code
        //It will always check what the last value is before; read from top to bottom

        System.out.println("-------------------------");

        //Addition assignment:
        int x = 100;

        System.out.println("x = " + x); //100

        //x = x + 200;
        x += 200;

        System.out.println("x = " + x); //300

        String str = "Wooden";

        str += " Spoon";

        System.out.println("str = " + str); //Wooden Spoon
        
        double num1 = 2.5;

        System.out.println("num1 = " + num1);
        
        num1 += 5.5;

        System.out.println("num1 = " + num1); //num1 = 8.0

        System.out.println("------------------------------");


        //withdrawing $500

        double availableBalance = 1000.50;

        //deposit $300
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------");

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);

        //=1300.5-500

        //withdraw 200, then depositing $400

        availableBalance -= 200;

        System.out.println("availableBalance = " + availableBalance);

        availableBalance += 400;

        System.out.println(availableBalance);

        System.out.println("------------------------");

        double salary = 50000.50;

        System.out.println("salary = " + salary);

        salary *=2; //salary = salary *2 is exactly the same as salary *=2;

        System.out.println("salary = " + salary);

        double dodge = 0.0000001;
        dodge *= 10000000;

        System.out.println("dodge = " + dodge);

        System.out.println("----------------------------");

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);
        //shorthand operators assign the new number back to the variable, so the variable will now have a new value past that line
        //shorthand operators +=, -=, *=, /=, %=

        System.out.println("-----------------------------");

        double num3 = 100;

        //%=

        num3 %= 3; //with this calculation, 1 will be assigned to this variable

        System.out.println("num3 = " + num3);

        System.out.println("-------------------------");

        int amount = 127; //cents

        int quarters = amount/25;
        int cents = amount%25;

        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        System.out.println("------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------------");

        int balance = 3500;

        //insurance fee = 153

        balance %= 153;

        System.out.println("balance = " + balance);










    }
}
