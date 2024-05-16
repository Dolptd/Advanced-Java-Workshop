package Q1;

public class IsNumeric implements ValidationStrategy { // IsNumeric is a class that implements ValidationStrategy
    public boolean execute(String s) { // execute is a method that takes a string as an argument
        return s.matches("\\d+"); // return true if s contains only digits
    }
}
