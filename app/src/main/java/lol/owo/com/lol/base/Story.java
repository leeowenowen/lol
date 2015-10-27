package lol.owo.com.lol.base;

import lol.owo.com.lol.base.location.Location;

/**
 * Created by wangli on 10/27/15.
 */
public class Story {
    private Location location;
    private Duration duration;
    private Actor actor;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
