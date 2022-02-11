package day45_Abstraction.Shape;

public class Cube extends Shape implements Volume{
    public Cube(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    private double radius;

}
