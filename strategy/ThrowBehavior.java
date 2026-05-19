package strategy;

import java.util.Random;

/**
 * ThrowBehavior class it implements the PlayBehavior and provides a specific implementation for the play method, which simulates throwing the ball by generating random speed and distance values for the ball to move.
 * @author Mi'Kayla Brown
 */
public class ThrowBehavior implements PlayBehavior {

    /**
     * A static random number generator for generating random values.
     */
    private static Random random = new Random();

    /**
     * A football object that represents the ball being thrown.
     */
    private MoveableItem ball = new Football();
    
    /**
     * Executes the throw play by moving the ball with random speed and distance values.
     */
    public void play() {
        int speed = random.nextInt(11) + 10;
        int distance = random.nextInt(80) +60;
        ball.move(speed, distance);
    }
    
}
