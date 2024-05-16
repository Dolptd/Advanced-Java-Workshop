package Lambda_Expression.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // List of Strings
    public static List<String> listOfStrings = Arrays.asList("a", "", "b", "", "c", "");

    // Predicate Example
    public static <T> List<T> filter(List<T> list, PredicateExample<T> p) {
        List<T> results = new ArrayList<>(); // Create a new list
        for (T t : list) { // Loop through the list
            if (p.test(t)) { // Check if the predicate is true
                results.add(t); // Add the result to the new list
            }
        }
        return results;
    }

    public static void main(String[] args) {
        // Create a predicate to filter non-empty strings from the list of strings
        PredicateExample<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        // Call the filter method to filter non-empty strings
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }

}
