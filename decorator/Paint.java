package decorator;

public class Paint extends VehicleDecorator {
    protected static final String RESET = "\u001B[0m";
    protected static final String GREEN = "\u001B[32m";
    protected static final String WHITE = "\u001B[37m";
    protected static final String RED = "\u001B[31m";
    protected static final String YELLOW = "\u001B[33m";
    protected static final String BROWN = "\u001B[38;2;139;69;19m";
    protected static final String BLUE = "\u001B[34m";
    protected static final String PURPLE = "\u001B[35m";
    private String color;

    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);
        this.color = color;

        String paintColor = RESET;

        if(color.equals("red")) {
            paintColor = RED;

        }
        else if(color.equals("green")) {
            paintColor = GREEN;

        }
        else if(color.equals("yellow")) {
            paintColor = YELLOW;

        }
         else if(color.equals("brown")) {
            paintColor = BROWN;

        }
        else if(color.equals("white")) {
            paintColor = WHITE;

        }
        else if (color.equals("blue")) {
            paintColor = BLUE;
        }
        else if (color.equals( "purple")) {
            paintColor = PURPLE;;
        }
    
        lines.set(0, paintColor + lines.get(0));
        lines.set(lines.size() - 1, lines.get(lines.size() - 1) + RESET);


    }

}