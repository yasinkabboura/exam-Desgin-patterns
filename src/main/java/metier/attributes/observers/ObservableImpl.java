package metier.attributes.observers;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.update(this));
    }
}

