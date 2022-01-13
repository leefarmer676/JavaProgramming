package Day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(5);
        ageOfPerson(1989);
        printNumbers(10, 20);

    }



    //create a function that can check if a number is odd or even
    public static void oddOrEven (int number){
        if(number%2==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson (int birthYear){
        int age = 2021-birthYear;
        System.out.println("Your age is " + age);
    }

    //create a functionthat can print all numbers between X and Y
    public static void printNumbers (int x, int y){
        while(x<=y){
            System.out.println(x++);
        }


    }

}
