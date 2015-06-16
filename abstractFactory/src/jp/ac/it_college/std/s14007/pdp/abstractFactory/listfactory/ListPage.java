package jp.ac.it_college.std.s14007.pdp.abstractFactory.listfactory;

import jp.ac.it_college.std.s14007.pdp.abstractFactory.factory.*;

import java.util.Iterator;

/**
 * Created by s14007 on 15/06/13.
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>/n");
        buffer.append("<ul>/n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
