package metier.codeGenerator;


import metier.Diagram;

public class GenerateCodeJava implements GenerateCode {
    @Override
    @Log
    public String generate(Diagram diagram) {
        return diagram.toString();
    }
}

