package Day38_Inheritance.CarTask;

import java.lang.Object;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " is in autopilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start");;
    }
}

