package decorator;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }   

     /**
     * Loops through the lines arraylist and returns them as a concatenated string.
     * @return A string representation of the vehicle.
     */
    public String toString(){
        String toReturn = "";
         for(String line : lines) {
            toReturn += line + "\n";
         }
         return toReturn;
    }
}