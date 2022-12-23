package methods;

import visibility.Visibility;

import java.util.List;

public class ConcreteMethod extends Method{
    private String type;
    private Visibility visibility;
    private boolean isFinal;
    private boolean isStatic;
    private boolean isAbstract;

    public ConcreteMethod(String name, String type, String visibility, List<Parametre> parametres) {
        super(name, parametres);
    }

}


