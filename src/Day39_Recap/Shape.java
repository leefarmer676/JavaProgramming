package Day39_Recap;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); //1: something went wrong
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("INvalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){  //method must have a body
        return 0;
    }
    public double perimeter(){
        return 0;
    }
}
