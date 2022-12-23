package metier.attributes.observers;

import metier.attributes.Attribute;

public class ObserverImpl implements Observer {
    Attribute attribute;

    public ObserverImpl(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public void update(Observable observable) {
        Attribute attribute = (Attribute)observable;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}

