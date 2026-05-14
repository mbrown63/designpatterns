package observer;

import java.util.ArrayList;

public class Influencer implements Subject{
    public static final String PURPLE = "\u001B[35m";
    // Reset color back to normal
    public static final String RESET = "\u001B[0m";
    private ArrayList<Observer> observers;
    private String name;
    private ArrayList<String> logo;
    
    public Influencer(String name, ArrayList<String> logo) {
        this.name = name;
        this.logo = logo;
        observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public String toString() {
        return name;
    }
    public void shareThought(String message){
        System.out.println(PURPLE + name + " \"If it's not posted, did I even experience it?\" " + RESET);

        for (Observer observer : observers) {
            observer.hearThought(message);
        }
    }
    public void promoteItem(Item item, String message){

        for (Observer observer : observers) {
            observer.hearPromotion(item, message);

        }

    }
    public String getName() {
        return name;
    }
}
