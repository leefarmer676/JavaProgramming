package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "white", 2021, 35000);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW", "331is", "Black", 2020, 45000);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "red", 2019, 40000);

        System.out.println(car3);

        //create an array that allows me to store these 3 cars in array

        //Car[] cars = {car1, car2, car3}; --but it's better to create an array list

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("---------------------");

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year >= 1995 && p.year<=1997);


        /*
        BMW: 2005-2008 eligible for recall
        Toyota: 1995-1997 eligible for recall
        remove all the cars eligible for recall
         */




    }

}
