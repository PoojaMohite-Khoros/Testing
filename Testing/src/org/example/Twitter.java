package org.example;

import java.util.Arrays;
import java.util.List;

public class Twitter {
    // Acts as my twitter library
    List<String> tweets = Arrays.asList("First Tweets", "Second Tweet", "Third Tweets");

    /**
     * @return list of tweets from user timeline
     */
    public List<String> getTweetsFromTwitter() {
        // library
        List<String> tweetsDownloaded = getTweets();
        return tweetsDownloaded;
    }
    /**
     * Java Doc
     */

    /**
     * @param tweet, a string to be sent to twitter to tweet
     * @return String which is a status of sending the tweet
     */
    public String sendTweet(String tweet) {
        // library
        String status = sendTweetToTwitter(tweet);
        if (status.equalsIgnoreCase("failure")) {
            return "Failed to post tweet";
        } else {
            return "Posted tweet successfully";
        }
    }

    private String sendTweetToTwitter(String tweet) {
        if (tweet == null || tweet.length() <= 0) {
            return "Failure";
        }
        tweets.add(tweet);
        return "Successful";
    }

    private List<String> getTweets() {
        // library , u have to hit but this will act as library
        return tweets;
    }
}
