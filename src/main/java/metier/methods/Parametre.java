package metier.methods;

public class Parametre {
    private String name;
    private String type;

    public Parametre(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}

