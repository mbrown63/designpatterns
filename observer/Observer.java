package observer;

public abstract class Observer {
    // ASCII Color Constants
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    // Reset color back to normal
    public static final String RESET = "\u001B[0m";
    
    protected Influencer influencer;
    protected String name;

    public Observer(Influencer influencer, String name) {
        this.influencer = influencer;
        this.name = name;
        influencer.registerObserver(this);
    }

    public abstract void hearThought(String thought);

    public abstract void hearPromotion(Item item, String message);

    public String toString() {
        return name;
    }

}
