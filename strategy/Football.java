package strategy;

import java.util.ArrayList;

/**
 * Concrete class representing a football item in the game. It extends the MoveableItem class and provides a specific ASCII representation for the football.
 * @author Mi'Kayla Brown
 */
public class Football extends MoveableItem{

    /**
     * Creats an arraylist representing the football ascii art.
     * @return An ArrayList of Strings representing the ASCII art of the football.
     */
    protected  ArrayList<String> getAsciiRepresentation() {
        ArrayList<String> ascii = new ArrayList<String>();
        ascii.add("   _.-=\"\"=-._\n");
        ascii.add(" .'\\\\-++++-//'.\n");
        ascii.add("(  ||      ||  )\n");
        ascii.add(" './/      \\\\.'\n");
        ascii.add("    `'-=..=-'`\n");
        return ascii;
    }
}   
