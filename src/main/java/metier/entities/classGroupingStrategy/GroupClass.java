package metier.entities.classGroupingStrategy;

import metier.springAOP.Log;

import java.util.ArrayList;
import java.util.List;

public class GroupClass implements Composant {

    private List<Composant> classes = new ArrayList<>();

    public GroupClass() {
    }

    @Log
    public void add(Composant composant){
        classes.add(composant);
    }
    @Log
    public void remove(Composant composant){
        classes.remove(composant);
    }
    @Log
    public List<Composant> getChilds(){
        return classes;
    }

}

