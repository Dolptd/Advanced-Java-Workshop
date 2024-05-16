package Method_Parameterization;

// This class is used to filter heavy apples.
public class AppleHeavyWeightPredicate implements ApplePredicate {

    // This method is used to filter heavy apples.
    public boolean test(Apple apple) {
        return apple.weight > 150;
    }
}