package strategy;

import java.util.ArrayList;

/**
 * Abstract class representing a moveable item in the game. It defines the structure for moveable items and provides a method to move the item across the screen based on its ASCII representation.
 * @author Mi'Kayla Brown
 */
public abstract class MoveableItem {
    protected abstract ArrayList<String> getAsciiRepresentation ();
    
    /**
     * Moves the item across the screen based on its ASCII representation. The speed and distance parameters control how fast and how far the item moves.
     * @param speed How fast to move the item, higher is faster, a reasonable speed is between 11 and 22.
     * @param distance How far to move the item, a reasonable distance is between 50 and 150.
     */
    public void move(int speed, int distance) {
        ArrayList<String> ascii = getAsciiRepresentation();

        //Loop for 100 in loop clear then draw then sleep for 100ms
            for(int i = 0; i <  distance; i++){
                Resources.clear();
                for (String line : ascii) {
                    System.out.println(" ".repeat(i) + line);
                }

                Resources.sleep(100/speed);
            }
    }

}
