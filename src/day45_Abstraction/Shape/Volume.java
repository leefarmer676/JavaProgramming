package day45_Abstraction.Shape;

public interface Volume {

    public static final boolean hasVolume = true; //can jyst type boolean hasVolume = true;

    double volume(); //abstract by default;
    //if you needed to put a body/implementation in this method, use the default method


}
