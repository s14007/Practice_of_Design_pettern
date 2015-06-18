package jp.ac.it_college.std.s14007.decorator;

/**
 * Created by s14007 on 15/06/16.
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) {
        this.display = display;
    }
}
