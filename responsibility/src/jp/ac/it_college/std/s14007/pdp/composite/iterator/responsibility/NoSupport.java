package jp.ac.it_college.std.s14007.pdp.composite.iterator.responsibility;

/**
 * Created by s14007 on 15/06/16.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
