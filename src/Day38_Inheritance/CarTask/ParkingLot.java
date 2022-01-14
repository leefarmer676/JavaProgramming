package Day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123445);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "red", 0);

        BMW bmw = new BMW("X6", 2020, 67350, "black", 200);



        toyota.start();
        tesla.start();
        bmw.start();
    }
}
