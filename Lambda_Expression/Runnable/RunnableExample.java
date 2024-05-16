package Lambda_Expression.Runnable;

public class RunnableExample implements Run {
    // Runnable is a functional interface; it takes no arguments and returns void.
    Runnable r1 = () -> System.out.println("Hello World 1");
    Runnable r2 = new Runnable() {
        public void run() { // Overriding the run method
            System.out.println("Hello World 2");
        }
    };

    // This method takes a Runnable object and calls its run method.
    public static void process(Runnable r) {
        r.run();// Call the run method
    }

    @Override
    // This method implements the run method from the Run interface.
    public void run() {
        process(r1);
        process(r2);
        process(() -> System.out.println("Hello World 3"));
    }

}
