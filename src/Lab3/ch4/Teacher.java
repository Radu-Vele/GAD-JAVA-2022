package Lab3.ch4;

import java.util.ArrayList;

public class Teacher implements ObservableSubject{

    ArrayList<Observer> observers;

    public Teacher() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        if(observers.contains(obj))
            observers.remove(obj);
    }

    public void teach(String subject) {
        notifyObservers(subject);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
}
