package javaInterviewCodingTasksFromRreze;

public class Feb11_Task1 {
    //write a method that can identify given number is even or odd
    //identify(5) --> odd

    public static void identify(int a){ //added static to be able to call in main method
        if(a%2==0){
            System.out.println(a + " is even");
        }else if(a%2!=0){
            System.out.println(a + " is odd");
        }else{
            System.err.println("Invalid input");;
        }
    }

    public static void main(String[] args) {
        identify(20);
        identify(11);
        identify(-1);
    }
}
