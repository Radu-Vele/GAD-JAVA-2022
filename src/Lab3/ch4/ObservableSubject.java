package Lab3.ch4;

public interface ObservableSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}
