package b26_day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

        for (String keys : store.keySet()) { //type is String because keys are String and that's
            //what we're trying to loop through
            System.out.println("Item: " + keys + " for $" + store.get(keys));
            //.get - put in the key, and it will return the value
            //used get method from Map to get the value based on the key
        }
            for (Map.Entry<String, Double> each : store.entrySet()) { //type is Map because entry sets are map
                // and that's what we're trying to loop through
                System.out.println("Item: " + each.getKey() + " for $" + each.getValue());
                //used the getValue method from the Entry, which gives value of the current entry

            }

        System.out.println(store.values()); //returns the values from the map as a collection type

        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();

        System.out.println(store.containsKey(item) ? item + " is in stock for $" + store.get(item) : "Not available in this store");

    }
}
