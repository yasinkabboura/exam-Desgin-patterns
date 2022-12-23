package relations;

import entities.Class;

public class Extend implements Relation{
    private Class superClass;
    private Class childClass;

    public Extend(Class superClass, Class childClass) {
        this.superClass = superClass;
        this.childClass = childClass;
    }

    public Extend() {
    }

    public Class getSuperClass() {
        return superClass;
    }

    public void setSuperClass(Class superClass) {
        this.superClass = superClass;
    }

    public Class getChildClass() {
        return childClass;
    }

    public void setChildClass(Class childClass) {
        this.childClass = childClass;
    }
}
