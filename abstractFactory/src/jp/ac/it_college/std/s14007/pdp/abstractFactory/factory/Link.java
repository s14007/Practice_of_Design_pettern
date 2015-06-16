package jp.ac.it_college.std.s14007.pdp.abstractFactory.factory;


/**
 * Created by s14007 on 15/06/13.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
