package relations;

import entities.Class;
import entities.Interface;

public class Implement implements Relation{
    private Interface sourceInterface;
    private Class childClass;

    public Implement(Interface sourceInterface, Class childClass) {
        this.sourceInterface = sourceInterface;
        this.childClass = childClass;
    }



    public Interface getSourceInterface() {
        return sourceInterface;
    }

    public void setSourceInterface(Interface sourceInterface) {
        this.sourceInterface = sourceInterface;
    }

    public Class getChildClass() {
        return childClass;
    }

    public void setChildClass(Class childClass) {
        this.childClass = childClass;
    }
}
