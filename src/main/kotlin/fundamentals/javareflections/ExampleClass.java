package fundamentals.javareflections;

public class ExampleClass {
    private final String exampleField;
    private final String otherExampleField;

    public ExampleClass(String exampleField, String otherExampleField){
        this.exampleField = exampleField;
        this.otherExampleField = otherExampleField;
    }

    public String getExampleField() {
        return exampleField;
    }

    public String getOtherExampleField() {
        return otherExampleField;
    }
}
