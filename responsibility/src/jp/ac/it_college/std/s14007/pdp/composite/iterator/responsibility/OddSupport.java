package jp.ac.it_college.std.s14007.pdp.composite.iterator.responsibility;

/**
 * Created by s14007 on 15/06/16.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
