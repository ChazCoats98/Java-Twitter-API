import java.time.Instant;

public class Tweet {
    private final long id;
    private final String username;
    private final String text;
    private final Instant timestamp;

    /**
     * @param id
     *          Unique identifier for the tweet.
     * @param username
     *              Username of author of the tweet.
     *              Required to be a Twitter username as defined by getAuthor() below.
     * @param text
     *          Text of the tweet, at most 280 characters.
     * @param timestamp
     *              date/time when the tweet was sent.
     */

    public Tweet(final long id, final String username, final String text, final Instant timestamp) {
        this.id = id;
        this.username = username;
        this.text = text;
        this.timestamp = timestamp;
    }


}
