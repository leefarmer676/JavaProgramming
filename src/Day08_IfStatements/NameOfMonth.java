package Day08_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {


        int n = 2;
        String month;

        if(n==1){
            month = "January";
        }else if(n==2) {
            month = "February";
        }else if (n==3){
            month = "March";
        } else if (n==4){
            month = "April";
        } else {
            month = "May"; //didn't go all the way to 12
        }
        System.out.println("The month is " + month);


    }
}
