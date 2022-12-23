package metier.codeGenerator.AncienGenerator;

import metier.Diagram;

public class AncienGeneratorC extends AncienGeneratorAdapter{
    @Override
    public String generate(Diagram diagram) {
        System.out.println("this is C langage");
        return diagram.toString();
    }
}
