package lol.owo.com.lol.base.design_pattern;

import java.util.List;

/**
 * Created by wangli on 15-11-15.
 */
public class Composite<Interface> implements Component<Interface> {
    private List<Interface> children;


    public void add(Interface child) {
        children.add(child);
    }

    public void remove(Interface child) {
        children.remove(child);
    }

    public List<Interface> children() {
        return children;
    }

}
