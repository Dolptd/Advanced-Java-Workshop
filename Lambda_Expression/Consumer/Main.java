package Lambda_Expression.Consumer;

import java.util.Arrays;
import java.util.List;

public class Main {
    // Consumer Example
    public static <T> void forEach(List<T> list, ConsumerExample<T> c) {
        for (T t : list) { // Loop through the list
            c.accept(t); // Call the accept method
        }
    }

    public static void main(String[] args) {
        forEach( // Call the forEach method
                Arrays.asList(1, 2, 3, 4, 5), // List of Integers
                (Integer i) -> System.out.println(i)); // Lambda Expression

    }
}
