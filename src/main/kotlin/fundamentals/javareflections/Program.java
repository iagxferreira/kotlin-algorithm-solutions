package fundamentals.javareflections;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        Arrays.stream(Reflections.class.getMethods()).forEach(System.out::println);
    }
}
