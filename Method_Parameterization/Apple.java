package Method_Parameterization;

public class Apple { // This class is used to represent an apple.
    String color;
    int weight;

    // This constructor is used to initialize the color and weight of the apple.
    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    // This method is used to get the color of the apple.
    public String getColor() {
        return color;
    }

    // This method is used to set the color of the apple.
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    // Why we have to override toString() method?
    // Because when we print an object, it prints the memory address of the object.
    // If we want to print the object in a human-readable format, we have to
    // override the toString() method.
    // This is the reason why we have to override the toString() method.

}
