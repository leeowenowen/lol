package lol.owo.com.lol.core.impl.story;


import lol.owo.com.lol.core.impl.actor.Person;
import lol.owo.com.lol.core.impl.location.PointLocation;
import lol.owo.com.lol.core.impl.time.Time;
import lol.owo.com.lol.core.impl.time.TimePoint;
import lol.owo.com.lol.core.interfaces.Actor;
import lol.owo.com.lol.core.interfaces.Location;
import lol.owo.com.lol.core.interfaces.Story;


/**
 * Created by wangli on 15-11-15.
 */
public class SimpleStory implements Story {
    private PointLocation location;
    private TimePoint timePoint;
    private Person mPerson;
    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public Time getTime() {
        return timePoint;
    }

    @Override
    public Actor getActor() {
        return null;
    }
}
