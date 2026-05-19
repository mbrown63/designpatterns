package decorator;

public class Rims extends VehicleDecorator {

    public Rims(Vehicle vehicle) {
        super(vehicle.lines);

        addRims();
    }

    private void addRims() {
        // add a - before and after the o
        //add a | on the line above and below the o

        for (int i = 0; i < lines.size(); i++) {
            while (lines.get(i).contains(" o ")) {
                
                if (i > 0) {
                    //line above
                    String prevString = lines.get(i-1);
                    int index = lines.get(i).indexOf(" o ") + 1;
                    String newString = prevString.substring(0, index) + "|" + prevString.substring(index + 1);
                    lines.set(i - 1, newString);

                    //line below
                    String nextString = lines.get(i + 1);
                    String newNextString = nextString.substring(0, index) + "|" + nextString.substring(index + 1);
                    lines.set(i + 1, newNextString);
                }
                
                String original = lines.get(i);
                int index = original.indexOf(" o ");
                String newString = original.substring(0, index) + "-o-" + original.substring(index + 3);
                lines.set(i, newString);
            }             
        }
    }
}
