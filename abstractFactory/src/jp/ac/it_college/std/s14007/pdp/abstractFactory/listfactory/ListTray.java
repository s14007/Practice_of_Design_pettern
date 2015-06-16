package jp.ac.it_college.std.s14007.pdp.abstractFactory.listfactory;

import jp.ac.it_college.std.s14007.pdp.abstractFactory.factory.*;

import java.util.Iterator;


/**
 * Created by s14007 on 15/06/13.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
