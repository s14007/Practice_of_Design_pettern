package jp.ac.it_college.std.s14007.pdp.composite.iterator.responsibility;

/**
 * Created by s14007 on 15/06/16.
 */
public class Trouble {
    private int number;
    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}
