package javaInterviewCodingTasksFromRreze;

import org.w3c.dom.ls.LSOutput;

public class Feb11_Task3 {
    //Numbers - Divide without / operator

    public static void main(String[] args) {
        divideWithoutOperator(30, 5);
        divideWithoutOperator(100, 10);
        divideWithoutOperator(50, 10);
        divideWithoutOperator(0, 10);
        divideWithoutOperator(7, 0);
        divideWithoutOperator(0, 0);
    }

    public static void divideWithoutOperator(int a, int b) {
        int resultCount = 0;
        if (a > 0 && b > 0) {
            do {
                a = a - b;
                resultCount++;
            } while (a >= b);
            System.out.println(resultCount);
        }else if(a==0 || b==0){
            resultCount=0;
            System.out.println(resultCount);
        }else{
            System.out.println("Negative numbers are not accommodated at this time");
        }
    }
}
