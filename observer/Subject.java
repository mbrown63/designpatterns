package observer;

/**
 * Interface representing a Subject in the Observer pattern. A Subject can add observers, remove observers, share thoughts, and promote items.
 * @author Mi'Kayla Brown
 */
public interface Subject {

        /**
         * Adds an observer to the subject's observer list.
         * @param observer The observer being added
         */
        public  void registerObserver(Observer observer);

        /**
         * Removes an observer from the subject's observer list.
         * @param observer The observer being removed
         */
        public void removeObserver(Observer observer);

        /**
         * Shares a thought message with observers.
         * @param message The thought being shared
         */
        public void shareThought(String message);

        /**
         * Promotes an item to observers.
         * @param item The item being promoted
         * @param message The promotion message
         */
        public void promoteItem(Item item, String message);
}