package fundamentals.javareflections;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        Arrays.stream(ExampleClass.class.getMethods()).forEach(System.out::println);

        var example = new ExampleClass(null, "example");

        System.out.println("Before: " + example.getExampleField());
        ReflectionUtils.set(example, "exampleField", "teste");

        System.out.println("After: " + example.getExampleField());
        ReflectionUtils.getNullProperties(example);
    }
}
