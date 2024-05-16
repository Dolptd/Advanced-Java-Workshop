package Boss.Example_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Consumer<Integer> consumer = (i) -> System.out.print(i + " ");
        // list.forEach(consumer);
        // System.out.println();

        list.forEach((i) -> System.out.println(i));
        List<Integer> modifiedList = list.stream()
                .map((Integer n) -> n * 2) // Map each element to its double
                .filter((Integer n) -> n > 5) // Filter out elements less than 5
                .limit(3) // Limit the number of elements to 3
                .sorted() // Sort the elements
                .collect(Collectors.toList()); // Collect the elements to a list

        // .forEach((Integer n) -> System.out.println(n)) // forEach can be used to
        // print the elements because it returns void

        modifiedList.forEach(System.out::println);

    }
}
