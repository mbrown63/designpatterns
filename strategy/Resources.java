package strategy;

import java.util.concurrent.TimeUnit;

/**
 * Resources class provides utility methods for managing the game resources.
 * @author Mi'Kayla Brown
 */

public class Resources {

    /**
     * Pauses the program. This method is used to create a delay in the game, allowing for smoother animations and transitions.
     * @param num The miliseconds to pause the program for
     */

    public static void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    /**
     * Clears the console
     */
    
    public static void clear() {
        System.out.print("\033[H\033[2J");
    }
}
