package Lambda_Expression.Functionn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // Function Example
    // map method
    // It takes a list and a function as arguments.
    public static <T, R> List<R> map(List<T> list, FunctionExample<T, R> f) {
        List<R> result = new ArrayList<>(); // Create a new list
        for (T t : list) { // Loop through the list
            // Call the apply method
            result.add(f.apply(t)); // Add the result to the new list
        }
        return result;
    }

    public static void main(String[] args) {
        // [7, 2, 6]
        // Call the map method

        List<Integer> myList = map( // Pass a list of strings and a lambda expression
                Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length()); // Lambda Expression
        System.out.println(myList);
    }
}
