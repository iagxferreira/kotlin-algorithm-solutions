package fundamentals.javareflections;

public class ExampleRecord {

    private final String exampleField;
    private final String otherExampleField;

    public ExampleRecord(String exampleField, String otherExampleField){
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
