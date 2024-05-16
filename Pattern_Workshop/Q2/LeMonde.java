package Q2;

public class LeMonde implements Observer {
    public void notify(String tweet) { // notify is a method that takes a string as an argument
        if (tweet != null && tweet.contains("wine")) { // if tweet is not null and contains "wine"
            System.out.println("Today cheese, wine and news " + tweet); // print "Today cheese, wine and news " + tweet
        }
    }
}
