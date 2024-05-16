package Q2;

public class Guardian implements Observer { // Guardian is an Observer
    public void notify(String tweet) { // notify is a method that takes a string as an argument
        if (tweet != null && tweet.contains("queen")) { // if tweet is not null and contains "queen"
            System.out.println("Yet more news from London... " + tweet); // print "Yet more news from London... " +
                                                                         // tweet
        }
    }
}
