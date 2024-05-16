package Q1;

public class Main {
    public static void main(String[] args) {
        // Validator numericValidator = new Validator(new IsNumeric());
        // boolean b1 = numericValidator.validate("aaaa");
        // Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        // boolean b2 = lowerCaseValidator.validate("bbbb");

        // Lambda expressions
        // ValidationStrategy numericValidator = s -> s.matches("\\d+");
        // boolean b1 = numericValidator.execute("aaaa");
        // ValidationStrategy lowerCaseValidator = s -> s.matches("[a-z]+");
        // boolean b2 = lowerCaseValidator.execute("bbbb");

        // System.out.println(b1);
        // System.out.println(b2);

        // Lambda expressions shorter version
        Validator numericValidator = new Validator(s -> s.matches("\\d+"));
        Validator lowerCaseValidator = new Validator(s -> s.matches("[a-z]+"));
        System.out.println("isNumeric : " + numericValidator.validate("aaaa"));
        System.out.println("isLowerCase : " + lowerCaseValidator.validate("bbbb"));

        System.out.println();
        System.out.println("This is Strategy Design Pattern.");
    }
}