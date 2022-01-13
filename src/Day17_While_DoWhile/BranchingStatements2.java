package Day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i ='A'; i <= 'E'; i++) {

            if( i == 'C'){
                break;
            }

            System.out.println(i);

        }
        System.out.println("--------------------------");
        //print all even numbers 1~10
        for(int i =0; i<= 10; i++){

            if(i%2!=0){
                continue; //if the condition is true, this means these numbers will be skipped

            }
            System.out.println(i);
        }


        System.out.println("-----------------------");
        //print all odd numbers 1~10
    }
}
