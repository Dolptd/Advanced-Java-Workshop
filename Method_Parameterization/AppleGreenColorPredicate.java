package Method_Parameterization;

// This class is used to filter green apples.
public class AppleGreenColorPredicate implements ApplePredicate {

    // This method is used to filter green apples.
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
