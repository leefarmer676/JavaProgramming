package Day40_FinalKeyword;

import Day39_Recap.shapeTask.Circle;
import Day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square; //return type of getter has to be square

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){

        if(circle.getRadius() < 5){
            return;
        }
        this.circle = circle;
    } //without public access modifier, can only use this within the package

}
