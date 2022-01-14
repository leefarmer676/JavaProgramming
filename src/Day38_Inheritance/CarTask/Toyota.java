package Day38_Inheritance.CarTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }
    @Override //optional - you don't have to add it, but it won't work if it's not overridden; checks if it is in fact overriden
    //also the little red arrow up on next line tells you you're overriding the method
    public void start(){
        System.out.println("Twist the key to iginition to start");
    }

}
