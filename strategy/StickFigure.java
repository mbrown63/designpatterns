package strategy;

import java.util.ArrayList;

/**
 * StickFigure class represents the quarterback in the game. It extends the MoveableItem class and provides a specific ASCII representation for the stick figure.
 * @author Mi'Kayla Brown
 */
public class StickFigure extends MoveableItem{

    /**
     * Creats an arraylist representing the Stick figure ascii art.
     * @return An ArrayList of Strings representing the ASCII art of the stick figure.
     */
    protected ArrayList<String> getAsciiRepresentation() {
        ArrayList<String> ascii = new ArrayList<String>();
        ascii.add("        _\n");
        ascii.add("      _( }\n");
        ascii.add(" _  <<  \\\n");
        ascii.add("`.\\__/`/\\\\\n");
        ascii.add("  '--'\\\\  `\n");
        ascii.add("      //\n");
        ascii.add("      \\)\n");
        return ascii;
    }   
}
