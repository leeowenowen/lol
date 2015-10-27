package lol.owo.com.lol.base;

import java.util.Date;

/**
 * Created by wangli on 10/27/15.
 */
public class Duration {
    Date start;
    Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public long value() {
        return end.getTime() - start.getTime();
    }
}
