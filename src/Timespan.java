import java.time.Instant;
import java.time.Duration;

public class Timespan {
    private final Instant start;
    private final Instant end;

    /**
     * @param start
     *          Starting timestamp as Instant instance
     * @param end
     *          Ending timestamp as Instant instance
     */

    public Timespan(Instant start, Instant end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("requires start value to be less than or equal to end value");
        } else {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * @return start value of timespan as an Instant type
     */
    public Instant getStart() {
        return start;
    }

    /**
     * @return end value of timespan as an Instant type
     */
    public Instant getEnd() {
        return end;
    }

    /**
     * @return a unique hashcode of this timespan object.
     *          This can be used to ensure uniqueness in hash-based collections.
     */
    public int hashCode() {
        int prime = 31; //prime number variable to help reduce hash collisions
        int result = 1;
        result = prime * result + this.start.hashCode();
        result = prime * result + this.end.hashCode();
        return result;
    }
}
