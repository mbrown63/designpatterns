package strategy;

import java.util.ArrayList;

public class StickFigure extends MoveableItem{

    public ArrayList<String> getAsciiRepresentation() {
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
