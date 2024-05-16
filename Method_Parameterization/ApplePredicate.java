package Method_Parameterization;

// This interface is used to filter apples.
public interface ApplePredicate {
    boolean test(Apple apple);
    // This method is used to filter apples.
    // It returns true if the apple meets the criteria.
}