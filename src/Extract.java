

import java.util.Set;
import java.time.Instant;
import java.util.List;

public class Extract {
    public static Timespan getTimespan(List<Tweet> tweets) {
        Instant[] timeArray = {};
        int i = 0;
        for (Tweet tweet : tweets) {
            timeArray[i] = tweet.getTimestamp();
            i++;
        }
        Timespan returnTimespan = new Timespan(timeArray[0], timeArray[1]);
        return returnTimespan;
    }
}
