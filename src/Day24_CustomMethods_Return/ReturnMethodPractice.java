package Day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int maxNumber = max(100, 200);
        System.out.println(maxNumber);
        int multiplication = maxNumber*2;
        System.out.println(multiplication);


    }

    //create a method that can find the maximum number between 2 numbers (100 and 200)
    //then multiply the max number by 2
    public static int max(int num1, int num2){
        int result = 0;

        if (num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
}
