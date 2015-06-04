package jp.ac.it_college.std.s14007.pdp;

/**
 * Created by s14007 on 15/06/04.
 */
public abstract class AbstractDisplay2 {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
