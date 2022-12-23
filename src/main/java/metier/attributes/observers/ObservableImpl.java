package metier.attributes.observers;

import metier.springAOP.Log;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    @Log
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    @Log
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    @Log
    public void notifyAllObservers() {
        observers.forEach(o -> o.update(this));
    }
}

