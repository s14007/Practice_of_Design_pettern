package jp.ac.it_college.std.s14007.pdp.abstractfactory.factory;

import java.util.ArrayList;

/**
 * Created by s14007 on 15/06/13.
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
