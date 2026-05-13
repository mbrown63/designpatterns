package strategy;

import java.util.Random;

/**
 * RunBehavior class represents the behavior of running with the ball.
 * @author Mi'Kayla Brown
 */
public class RunBehavior implements PlayBehavior {

    private static Random random = new Random();
    private MoveableItem stickFigure = new StickFigure();
    
    /**
     * It generates random speed and distance values for the stick figure to move, simulating a running play in the game.
     * @param speed The speed at which the stick figure will run, randomly generated between 10 and 20.
     * @param distance The distance the stick figure will run, randomly generated between 60 and 140.
     */
    public void play() {
        int speed = random.nextInt(11) + 10;
        int distance = random.nextInt(80) +60;
        stickFigure.move(speed, distance);
        
    }
    
}

