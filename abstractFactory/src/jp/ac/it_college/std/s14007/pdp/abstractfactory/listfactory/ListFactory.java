package jp.ac.it_college.std.s14007.pdp.abstractfactory.listfactory;

import jp.ac.it_college.std.s14007.pdp.abstractfactory.factory.*;

/**
 * Created by s14007 on 15/06/13.
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
