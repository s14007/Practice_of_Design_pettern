package jp.ac.it_college.std.s14007.pdp.composite.iterator.responsibility;

/**
 * Created by s14007 on 15/06/16.
 */
public class LimitSupport extends Support {
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
