package lol.owo.com.lol.core.impl.time;

import java.util.Date;

/**
 * Created by wangli on 15-11-15.
 */
public class TimePoint implements Time {
    private final Date date;

    public TimePoint() {
        this(new Date());
    }

    public TimePoint(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

}
