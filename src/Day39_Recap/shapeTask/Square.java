package Day39_Recap.shapeTask;

public class Square extends Shape{
    //variable that cannot be inherited first before you use the extended keyword

    private double side;

    public Square(double side) {
        super("square");
        setSide(side); //changing it to this means it can also check the requirements
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }



    public double getSide() {
        return side;
    }

    public void setSide(double side) { //responsible for settingthe private variable
        if(side<=0){
            System.err.println("invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }
}
