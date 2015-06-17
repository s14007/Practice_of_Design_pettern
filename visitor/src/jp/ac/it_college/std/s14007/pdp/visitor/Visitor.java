package jp.ac.it_college.std.s14007.pdp.visitor;

/**
 * Created by s14007 on 15/06/17.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
