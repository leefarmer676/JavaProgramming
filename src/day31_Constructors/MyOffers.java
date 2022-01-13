package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon", "SDET", 110000, true, true, true, true  );

        Offer offer2 = new Offer();
        offer2.setInfo("California", "Sony", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapOne", "scrummaster", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Boa", "business analyst", 130000, true, true, false, true);


        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);

        Offer[] myOffers = {offer1, offer2,offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p->!p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("VA")||p.location.equals("California")));//removes the offer if the offer is not from local area
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " + localOffer.salary);
        }


    }
}
