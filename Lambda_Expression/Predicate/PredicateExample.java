package Lambda_Expression.Predicate;

@FunctionalInterface
// Generic Functional Interface
// Predicate is a functional interface; it takes an argument and returns a
// boolean.
public interface PredicateExample<T> {
    boolean test(T t); // This method takes an argument and returns a boolean.
}
