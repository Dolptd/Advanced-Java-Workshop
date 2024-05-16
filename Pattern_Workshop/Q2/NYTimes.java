package Q2;

public class NYTimes implements Observer {
    @Override
    public void notify(String tweet) { // notify is a method that takes a string as an argument
        if (tweet != null && tweet.contains("money")) { // if tweet is not null and contains "money"
            System.out.println("Breaking news in NY! " + tweet); // print "Breaking news in NY! " + tweet
        }
    }
}
