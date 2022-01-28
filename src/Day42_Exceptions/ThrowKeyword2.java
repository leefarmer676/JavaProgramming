package Day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("There is no such element as break");
        //calls parent class constructor that takes String arg
        //after throw keyword, rest of class is unreadable; cannot do any other print statements, etc.
        //using throw keyword with checked exceptions doesn't help; only use with unchecked exceptions
        //throw new Rectangle(5, 7);//error bc rectangle does not have a relationship with "Throwable" class
    }
}
