package relations;

import entities.Entity;


public class Destination {
    private Entity entity;
    private Cardinality[] cardinality = new Cardinality[2];

    public Destination(Entity entity, Cardinality[] cardinality) {
        this.entity = entity;
        this.cardinality = cardinality;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Cardinality[] getCardinality() {
        return cardinality;
    }

    public void setCardinality(Cardinality[] cardinality) {
        this.cardinality = cardinality;
    }
}
