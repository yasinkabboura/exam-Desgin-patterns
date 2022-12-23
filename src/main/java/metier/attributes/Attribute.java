package metier.attributes;


import metier.springAOP.Log;

public class Attribute {
    private String name;
    private String type;
    private boolean isFinal;
    private boolean isStatic;


    public Attribute(String name, String type, boolean isFinal, boolean isStatic) {
        this.name = name;
        this.type = type;

        this.isFinal = isFinal;
        this.isStatic = isStatic;
    }
}



