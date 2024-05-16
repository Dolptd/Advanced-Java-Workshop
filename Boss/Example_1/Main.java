package Boss.Example_1;

public class Main {
    public static void main(String[] args) {
        // // Original code before lambda
        // Cat cat = new Cat();
        // cat.print();

        // // Lambda expression implementation
        // Printable cat = new Printable() {
        // @Override
        // public void print() {
        // System.out.println("Meow Meow!");
        // }
        // };
        // cat.print();

        // Lambda expression implementation with parameter
        Printable cat = (s) -> System.out.println(s + "Meow Meow!");
        cat.print("Hello! ");

    }
}
