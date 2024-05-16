package Lambda_Expression.Functionn;

@FunctionalInterface

// Generic Functional Interface
// Function is a functional interface; it takes an argument and returns a value.
public interface FunctionExample<T, R> {
    R apply(T t); // This method takes an argument and returns a value.
}
