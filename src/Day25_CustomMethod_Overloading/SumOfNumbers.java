package Day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
       int result = sumOf2Numbers(2,3);
        System.out.println(result*2);
        int result2 = sumOf3Numbers(10,20,30);
        System.out.println("sum2 = " + result2);

    }
    public static int sumOf2Numbers(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
        //or: return a+b;
    }
    //create method that can do the sum of 3 numbers
    public static int sumOf3Numbers (int a, int b, int c){
        return a+b+c;
    }
    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
