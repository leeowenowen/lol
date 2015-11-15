package lol.owo.com.lol.base.interfaces;

import lol.owo.com.lol.base.impl.actor.Person;
import lol.owo.com.lol.base.impl.time.Duration;


/**
 * Created by wangli on 10/27/15.
 */
public interface Story {
    Location getLocation();
    Duration getDuration();
    Actor getActor();
}
