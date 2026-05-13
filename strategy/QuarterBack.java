package strategy;

/**
 * QuarterBack class represents a quarter back player in the game. It extends the Player class and implements the setPlayBehavior method to randomly choose between throwing or running the ball.
 * @author Mi'Kayla Brown
 */

import java.util.Random;

public class QuarterBack extends Player {
    private static Random random = new Random();
    private PlayBehavior throwBehavior = new ThrowBehavior();
    private PlayBehavior runBehavior = new RunBehavior();
    
    public QuarterBack(String firstName, String lastName, String team) {
        super(firstName, lastName, team);
    }

    protected void setPlayBehavior() {
        int randomNum = random.nextInt(2);
        if (randomNum == 0) {
            playBehavior = throwBehavior;
        } else {
            playBehavior = runBehavior;
        }
    }


    
}
