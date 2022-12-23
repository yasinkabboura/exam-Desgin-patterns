package metier.entities;

import metier.methods.ConcreteMethod;

import java.util.ArrayList;
import java.util.List;

public class Record extends Entity{
    private List<ConcreteMethod> gettersAndSetters = new ArrayList<>();
    public Record(String name) {
        super(name);
    }

    public List<ConcreteMethod> getGettersAndSetters() {
        return gettersAndSetters;
    }

    public void setGettersAndSetters(List<ConcreteMethod> gettersAndSetters) {
        this.gettersAndSetters = gettersAndSetters;
    }
}
