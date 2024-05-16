package Q1;

public class IsAllLowerCase implements ValidationStrategy { // IsAllLowerCase is a class that implements
                                                            // ValidationStrategy
    public boolean execute(String s) { // execute is a method that takes a string as an argument
        return s.matches("[a-z]+"); // return true if s contains only lowercase letters
    }
}
