package jp.ac.it_college.std.s14007.pdp.composite;

/**
 * Created by s14007 on 15/06/14.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
