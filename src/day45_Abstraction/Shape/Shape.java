package day45_Abstraction.Shape;

public abstract class Shape {

    private final String name;

    public String getName() {
        return name;
    }

    public Shape() {
        this.name = getClass().getSimpleName();
    }
    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
