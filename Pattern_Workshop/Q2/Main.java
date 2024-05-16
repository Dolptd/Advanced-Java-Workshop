package Q2;

public class Main {
    public static void main(String[] args) {
        Feed f = new Feed(); // subject

        // f.registerObserver(new NYTimes());
        // f.registerObserver(new Guardian());
        // f.registerObserver(new LeMonde());

        f.registerObserver((tweet) -> {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY! " + tweet);
            }
        });
        f.registerObserver((tweet) -> {
            if (tweet != null && tweet.contains("queen")) {
                System.out.println("Yet more news from London... " + tweet);
            }
        });
        f.registerObserver((tweet) -> {
            if (tweet != null && tweet.contains("wine")) {
                System.out.println("Today cheese, wine and news " + tweet);
            }
        });
        f.notifyObservers("The queen said her favourite book is Modern Java in Action!");

        System.out.println();
        System.out.println("This is Observer Design Pattern.");
    }
}
