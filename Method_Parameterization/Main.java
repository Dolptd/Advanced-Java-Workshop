package Method_Parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a list of apples.
        List<Apple> apple = Arrays.asList(new Apple("green", 150),
                new Apple("red", 160));

        // Filter green apples.
        System.out.println(filterApples(apple, new AppleHeavyWeightPredicate()));
    }

    // This method is used to filter apples.
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>(); // Create a list to store the result.
        for (Apple apple : inventory) { // Loop through the list of apples.
            if (p.test(apple)) { // Check if the predicate is true.
                result.add(apple); // Add the result to the list.
            }
        }
        return result;
    }
}
