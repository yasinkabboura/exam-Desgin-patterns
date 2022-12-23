package entities;

import attributes.Attribute;
import entities.classGroupingStrategy.Composant;
import methods.ConcreteMethod;
import methods.Constructor;


import java.util.ArrayList;
import java.util.List;

public class Class extends Entity implements Composant {
    private boolean isPublic;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;


    private final List<ConcreteMethod> methods = new ArrayList<>();
    private final List<Constructor> constructors = new ArrayList<>();
    private final List<Attribute> attributes = new ArrayList<>();

    public Class(String name) {
        super(name);
    }


    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }


    public List<ConcreteMethod> getMethods() {
        return methods;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }
}
