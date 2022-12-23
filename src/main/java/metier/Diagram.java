package metier;

import metier.codeGenerator.GenerateCode;
import metier.codeGenerator.GenerateCodeJava;
import metier.entities.Entity;
import metier.export.BinaryExporter;
import metier.export.Exporter;
import metier.relations.Relation;

import java.util.ArrayList;
import java.util.List;

public class Diagram {
    List<Entity> entities = new ArrayList<>();
    List<Relation> relations = new ArrayList<>();
    GenerateCode generateCode = new GenerateCodeJava();
    Exporter diagramExporter = new BinaryExporter();


    public Diagram(List<Entity> entities, List<Relation> relations, GenerateCode generateCode, Exporter diagramExporter) {
        this.entities = entities;
        this.relations = relations;
        this.generateCode = generateCode;
        this.diagramExporter = diagramExporter;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public GenerateCode getGenerateCode() {
        return generateCode;
    }

    public void setGenerateCode(GenerateCode generateCode) {
        this.generateCode = generateCode;
    }

    public Exporter getDiagramExporter() {
        return diagramExporter;
    }

    public void setDiagramExporter(Exporter diagramExporter) {
        this.diagramExporter = diagramExporter;
    }
}
