package entities;



import methods.AbstractMethod;

import java.util.ArrayList;
import java.util.List;


public class Interface extends Entity {

    private final List<AbstractMethod> methods = new ArrayList<>();

    public Interface(String name) {
        super(name);
    }
}

