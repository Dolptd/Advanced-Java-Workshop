package Q1;

public class Validator {
    // Validator is a class that has a field of type ValidationStrategy
    private final ValidationStrategy strategy; // strategy is a field of type ValidationStrategy

    // Validator is a constructor that takes a ValidationStrategy as an argument
    public Validator(ValidationStrategy v) {
        this.strategy = v; // set the field strategy to the argument v
    }

    // Validator is a method that takes a string as an argument and returns a
    // boolean
    public boolean validate(String s) {
        // return the result of calling the execute method on the field strategy with
        // the argument s
        return strategy.execute(s);
    }
}
