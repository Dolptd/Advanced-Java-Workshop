package Lambda_Expression.Consumer;

@FunctionalInterface
// Generic Functional Interface
// Consumer is a functional interface; it takes an argument and returns nothing.
public interface ConsumerExample<T> {
    void accept(T t); // This method takes an argument and returns nothing.
}
