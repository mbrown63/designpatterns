package observer;

public interface Subject {
        public  void registerObserver(Observer observer);
        public void removeObserver(Observer observer);
        public void shareThought(String message);
        public void promoteItem(Item item, String message);
}
