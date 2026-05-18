package observer;

/**
 * Abstract class representing an observer that follows an influencer. Observers can react to thoughts and promotions shared by the influencer.
 * @author Mi'Kayla Brown
 */
public abstract class Observer {

    // ASCII Color Constants
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    // Reset color back to normal
    public static final String RESET = "\u001B[0m";
    
    // The influencer this observer follows
    protected Influencer influencer;

    // The observer's name
    protected String name;

    /**
     * Creates an Observer object using an influencer and observer name. Also registers the observer to the influencer automatically.
     * @param influencer The influencer being followed
     * @param name The observer's name
     */
    public Observer(Influencer influencer, String name) {
        this.influencer = influencer;
        this.name = name;

        // Adds this observer to the influencer's observer list
        influencer.registerObserver(this);
    }

    /**
     * Abstract method that handles thoughts shared by the influencer.
     * @param thought The thought shared by the influencer
     */
    public abstract void hearThought(String thought);

    /**
     * Abstract method that handles promotions shared by the influencer.
     * @param item The item being promoted
     * @param message The promotion message
     */
    public abstract void hearPromotion(Item item, String message);

    /**
     * Returns the observer's name as a string.
     * @return The observer's name
     */
    public String toString() {
        return name;
    }

}