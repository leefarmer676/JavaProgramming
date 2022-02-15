package javaInterviewCodingTasksFromRreze;

public class Feb11_Task2 {
    //Numbers - FINRA
    // Prints numbers 1-30
    // multiple of 3, print FIN
    // multiple of 5, print RA
    //multiple of 3 and 5, print FINRA

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if(i%3==0 && i%5==0){
                System.out.print(" FINRA");
            }else if(i%3==0){
                System.out.print(" FIN");
            }else if(i%5==0){
                System.out.print(" RA");
            }else{
                System.out.print(" " + i);
            }
        }
    }
}
