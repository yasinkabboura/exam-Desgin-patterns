package metier.relations;

public class Association implements Relation {
    private Source source;
    private Destination destination;
    private boolean isBidirecctional;

    public Association(Source source, Destination destination, boolean isBidirecctional) {
        this.source = source;
        this.destination = destination;
        this.isBidirecctional = isBidirecctional;
    }
}


