package observer;

import java.util.ArrayList;

/**
 * Represents an Influencer that can share thoughts and promote items to followers. 
 * @author Mi'Kayla Brown
 */
public class Influencer implements Subject{

    // Purple text color
    public static final String PURPLE = "\u001B[35m";

    // Reset color back to normal
    public static final String RESET = "\u001B[0m";

    // Stores all observers following the influencer
    private ArrayList<Observer> observers;

    // Stores the influencer's name
    private String name;

    // Stores the influencer's logo
    private ArrayList<String> logo;
    
    /**
     * Creates an Influencer object with a name and logo. It also creates the observer list.
     * @param name The influencer's name
     * @param logo The influencer's logo
     */
    public Influencer(String name, ArrayList<String> logo) {
        this.name = name;
        this.logo = logo;
        observers = new ArrayList<Observer>();
    }
    
    /**
     * Adds an observer to the influencer's follower list.
     * @param observer The observer being added
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * Removes an observer from the influencer's follower list.
     * @param observer The observer being removed
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * Returns the influencer's name as a string.
     * @return The influencer's name
     */
    public String toString() {
        return name;
    }

    /**
     * Shares a thought with all observers following the influencer.
     * @param message The message being shared
     */
    public void shareThought(String message){

        // Prints the influencer's thought
        System.out.println(PURPLE + name + " \"If it's not posted, did I even experience it?\" " + RESET);

        // Sends the thought to every observer
        for (Observer observer : observers) {
            observer.hearThought(message);
        }
    }

    /**
     * Promotes an item to all observers following the influencer.
     * @param item The item being promoted
     * @param message The promotion message
     */
    public void promoteItem(Item item, String message){

        // Sends the promotion to every observer
        for (Observer observer : observers) {
            observer.hearPromotion(item, message);

        }

    }

    /**
     * Returns the influencer's name.
     * @return The influencer's name
     */
    public String getName() {
        return name;
    }
}