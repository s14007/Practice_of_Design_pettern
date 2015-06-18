package jp.ac.it_college.std.s14007.pdp.composite.iterator.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by s14007 on 15/06/16.
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
