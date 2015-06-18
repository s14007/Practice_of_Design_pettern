package jp.ac.it_college.std.s14007.pdp.abstractfactory.listfactory;

import jp.ac.it_college.std.s14007.pdp.abstractfactory.factory.Link;;

/**
 * Created by s14007 on 15/06/13.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "<li><a href=\""  + url + "\">" + caption + "</a></li>\n ";
    }
}
