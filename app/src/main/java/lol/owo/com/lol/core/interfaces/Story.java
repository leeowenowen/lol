package lol.owo.com.lol.core.interfaces;

import lol.owo.com.lol.core.impl.time.Time;


/**
 * Created by wangli on 10/27/15.
 */
public interface Story {
    Location getLocation();
    Time getTime();
    Actor getActor();
    Attachment getAttachment();
}
