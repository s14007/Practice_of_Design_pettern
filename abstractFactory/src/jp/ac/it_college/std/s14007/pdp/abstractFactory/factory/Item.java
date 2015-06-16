package jp.ac.it_college.std.s14007.pdp.abstractFactory.factory;

/**
 * Created by s14007 on 15/06/13.
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
