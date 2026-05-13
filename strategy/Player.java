package strategy;

/**
 * Player class represents the player in the game. It contains the player's information and defines the structure for executing a play.
 * @author Mi'Kayla Brown
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    private String team;
    protected PlayBehavior playBehavior;
   
   /**
    * It initializes the player's first name, last name, and team.
    * @param firstName the player's first name
    * @param lastName the player's last name
    * @param team the player's team
    */
    public Player(String firstName, String lastName, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    protected abstract void setPlayBehavior();

    public void play() {
        setPlayBehavior();
        playBehavior.play();
    }

    public String toString() {
        return firstName + " " + lastName + " - " + team;
    }
}
