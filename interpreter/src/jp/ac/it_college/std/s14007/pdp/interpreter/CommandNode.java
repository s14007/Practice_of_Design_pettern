package jp.ac.it_college.std.s14007.pdp.interpreter;

import java.util.ArrayList;

/**
 * Created by s14007 on 15/06/18.
 */
public class CommandNode extends Node {
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    public String toString() {
        return node.toString();
    }
}
