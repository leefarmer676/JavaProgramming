package Day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or no split (Yes or No)?");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 :(service.equals("great"))? .20
                :(service.equals("good"))? .15 :(service.equals("fair"))? .1 : .05;

        double totalTip = checkAmount*tipRate;

        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: $" + checkAmount);
        System.out.println("Tip: " + totalTip);

        if(yesOrNo.equals("yes")){
            System.out.println("Total per person: " + (checkAmount/numOfPeople));
            System.out.println("Tip per person: " + (totalTip/numOfPeople));

        }

        scan.close();

    }
}
