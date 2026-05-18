package observer;

/**
 * Represents an item that can be promoted by an influencer. Stores the item's name, description, and price.
 * @author Mi'Kayla Brown
 */
public class Item {

    // Stores the item's name
    private String name;

    // Stores the item's description
    private String description;

    // Stores the item's price
    private double price;

    /**
     * Creates an Item object with a name, description, and price.
     * @param name The item's name
     * @param description The item's description
     * @param price The item's price
     */
    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * @return The item's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return The item's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return The item's price
     */
    public double getPrice() {
        return price;
    }

}