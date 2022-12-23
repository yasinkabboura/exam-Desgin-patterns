package metier.codeGenerator.AncienGenerator;

import metier.Diagram;
import metier.codeGenerator.GenerateCode;

public class AncienGeneratorAdapter implements GenerateCode {
    @Override
    public String generate(Diagram diagram) {
        return diagram.toString();
    }
}
