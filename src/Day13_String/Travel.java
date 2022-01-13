package Day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport? (Yes or no)");

        String validPassport = scan.next().toLowerCase();

        if(validPassport.equals("yes")){
            int ticketCost = 1000;
            scan.nextLine();

            System.out.println("What country are you traveling to?");
            String country = scan.nextLine();

            System.out.println("How many bags are you bringing?");
            byte numberBags = scan.nextByte();
            ticketCost += numberBags*50;
            scan.nextLine();

            System.out.println("How many people are you traveling with?");
            short numPeople = scan.nextShort();
            if(numPeople==1){
                ticketCost -= 100;
            }else if(numPeople==2){
                ticketCost -= 200;
            }else if(numPeople>=3) {
                ticketCost -= 300;
            }

            scan.nextLine();
            System.out.println("Enter the names of the people you are traveling with:");
            String peopleTravelWith = scan.nextLine();

            System.out.println("Your ticket is booked to " + country + ". " +
                    "We have charged extra for the " + numberBags + " bags, but you are traveling " +
                    "with " + peopleTravelWith + " so we are giving a discount. Your total cost is " +
                    ticketCost);





        }else if(validPassport.equals("no")){
            int ticketCost = 200;

            System.out.println("What year did your passport expire?");
            int expireYear = scan.nextInt();
            if(expireYear < 2021){
                ticketCost += 75*(2021-expireYear);
            }

            scan.nextLine();
            System.out.println("Which country do you plan to travel?");
            String country = scan.nextLine();

            System.out.println("Will you be traveling in the next year? (yes/no)");
            String travelNextYear = scan.nextLine();
            if(travelNextYear.equalsIgnoreCase("yes")){
                ticketCost += 100;
            }else if(travelNextYear.equalsIgnoreCase("no")){
                ticketCost -= 50;
            }

            System.out.println("Looks like your passport has been expired for " + (2021-expireYear) +
                    " years, but not to worry we'll get it ready for you to travel to " + country + ". Your total" +
                    "cost has coume out to " + ticketCost + ".");

        }else {
            System.out.println("Invalid answer");



        }
scan.close();
    }
}
