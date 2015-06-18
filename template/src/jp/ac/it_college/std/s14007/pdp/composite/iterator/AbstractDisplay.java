package jp.ac.it_college.std.s14007.pdp.composite.iterator;

/**
 * Created by s14007 on 15/06/04.
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
