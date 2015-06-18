package jp.ac.it_college.std.s14007.pdp.composite.iterator.visitor;

import java.util.Iterator;

/**
 * Created by s14007 on 15/06/17.
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";

    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
