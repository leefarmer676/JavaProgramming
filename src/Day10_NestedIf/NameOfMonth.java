package Day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        String result = ""; //must be initialized so there's not a compiler error later; this is a local variable

        int number = 1;

        if(number >=1 && number<=12){ //if number is valid

            if(number==1){
                result = "January";
            }else if(number ==2){
                result = "February";
            }//continue with else if until else, then result = december

        }else{
            result ="invalid number";
        }
        System.out.println(result);

    }
}
