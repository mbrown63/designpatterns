package strategy;

import java.util.ArrayList;

public class Football extends MoveableItem{

    public ArrayList<String> getAsciiRepresentation() {
        ArrayList<String> ascii = new ArrayList<String>();
        ascii.add("   _.-=\"\"=-._\n");
        ascii.add(" .'\\\\-++++-//'.\n");
        ascii.add("(  ||      ||  )\n");
        ascii.add(" './/      \\\\.'\n");
        ascii.add("    `'-=..=-'`\n");
        return ascii;
    }   
}
