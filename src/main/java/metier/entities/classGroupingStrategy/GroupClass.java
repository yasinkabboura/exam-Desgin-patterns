package metier.entities.classGroupingStrategy;

import java.util.ArrayList;
import java.util.List;

public class GroupClass implements Composant {

    private List<Composant> classes = new ArrayList<>();

    public GroupClass() {
    }

    public void add(Composant composant){
        classes.add(composant);
    }
    public void remove(Composant composant){
        classes.remove(composant);
    }
    public List<Composant> getChilds(){
        return classes;
    }

}

