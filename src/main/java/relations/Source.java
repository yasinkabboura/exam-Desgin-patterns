package relations;

public class Source {
    private Class sourceClass;
    private Cardinality[] cardinality = new Cardinality[2];

    public Source(Class sourceClass, Cardinality[] cardinality) {
        this.sourceClass = sourceClass;
        this.cardinality = cardinality;
    }

    public Class getSourceClass() {
        return sourceClass;
    }

    public void setSourceClass(Class sourceClass) {
        this.sourceClass = sourceClass;
    }

    public Cardinality[] getCardinality() {
        return cardinality;
    }

    public void setCardinality(Cardinality[] cardinality) {
        this.cardinality = cardinality;
    }
}
