package jp.ac.it_college.std.s14007.pdp.abstractFactory.listfactory;

import jp.ac.it_college.std.s14007.pdp.abstractFactory.factory.*;

/**
 * Created by s14007 on 15/06/13.
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}
