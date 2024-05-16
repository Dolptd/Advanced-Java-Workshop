package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(4, 5, 7, 8, 9);
        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1);

        // filter
        Stream<Integer> s = nums.stream().filter(n -> n % 2 == 0);
        s.forEach(System.out::println); // 4, 8

        // map
        Stream<Integer> s1 = nums.stream().map(n -> n * n);
        s1.forEach(System.out::println); // 16, 25, 49, 64, 81

        // reduce
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum); // 33

        // collect
        List<Integer> list = nums.stream().filter(n -> n % 2 == 0).collect(java.util.stream.Collectors.toList());
        System.out.println(list); // [4, 8]

        // forEach
        nums.stream().forEach(System.out::println); // 4, 5, 7, 8, 9

        // flatMap
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        Stream<Integer> s2 = list1.stream().flatMap(l -> l.stream());
        s2.forEach(System.out::println); // 1, 2, 3, 4, 5, 6

        // sorted
        Stream<Integer> s3 = nums.stream().sorted();
        s3.forEach(System.out::println); // 1, 2, 5, 6, 8

        // distinct
        Stream<Integer> s4 = nums.stream().distinct();
        s4.forEach(System.out::println); // 4, 5, 7, 8, 9

        // limit
        Stream<Integer> s5 = nums.stream().limit(3);
        s5.forEach(System.out::println); // 4, 5, 7

        // skip
        Stream<Integer> s6 = nums.stream().skip(3);
        s6.forEach(System.out::println); // 8, 9

        // count
        long count = nums.stream().count();
        System.out.println(count); // 5

        // anyMatch
        boolean b = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(b); // true

        // allMatch
        boolean b1 = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println(b1); // false

        // noneMatch
        boolean b2 = nums.stream().noneMatch(n -> n % 2 == 0);
        System.out.println(b2); // false

        // findFirst
        int first = nums.stream().findFirst().get();
        System.out.println(first); // 4

        // findAny
        int any = nums.stream().findAny().get();
        System.out.println(any); // 4

        // toArray
        Object[] arr = nums.stream().toArray();
        System.out.println(Arrays.toString(arr)); // [4, 5, 7, 8, 9]

    }
}
