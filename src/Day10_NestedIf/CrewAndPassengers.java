package Day10_NestedIf;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int num = 50;
        String result = "";
        boolean validNumber = num == 50 || num == 75 || num == 100;

        if (validNumber) {

            if(num==100){
                result = "30 crew, 70 passengers";
            }else if(num==75){
                result = "25 crew, 50 passengers";
            }else if(num==50){
                result = "20 crew, 30 passengers";
            }



        } else {
            result ="invalid number";
        }
        System.out.println("result = " + result);
    }
}
