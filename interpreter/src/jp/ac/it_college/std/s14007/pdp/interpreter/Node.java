package jp.ac.it_college.std.s14007.pdp.interpreter;

/**
 * Created by s14007 on 15/06/18.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
