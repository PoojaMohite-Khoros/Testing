package org.example;

import java.util.List;

public class Controller {
    Twitter twitter;

    /***
     * Default Constructor
     */
    public Controller() {
        twitter = new Twitter();
    }
    public Controller(Twitter twitter) { // used for testing to send mock twitter object
        this.twitter = twitter;
    }
    /***
     *
     * @return list of tweet in org.example.Response Object
     */
    public Response getTweets() {
        List<String> tweets = twitter.getTweetsFromTwitter();
        return new Response(200, tweets);
    }

    public Response sendTweet(String tweet) {
        String status = twitter.sendTweet(tweet);
        return new Response(200, status);
    }
}
