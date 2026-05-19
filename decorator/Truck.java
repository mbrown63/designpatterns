package decorator;

public class Truck extends Vehicle {

        final String BROWN = "\u001B[38;2;139;69;19m";
        final String RESET = "\u001B[0m";
        
    public Truck() {
        super(FileReader.getLines("decorator/truck.txt"));
        System.out.println(BROWN + "TRUCK" + RESET);

    }
}
