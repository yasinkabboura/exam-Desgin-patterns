package metier.codeGenerator.AncienGenerator;

import metier.Diagram;
import metier.springAOP.Log;

public class AncienGeneratorC extends AncienGeneratorAdapter{
    @Override
    @Log
    public String generate(Diagram diagram) {
        System.out.println("this is C langage");
        return diagram.toString();
    }
}
