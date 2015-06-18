package jp.ac.it_college.std.s14007.pdp.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by s14007 on 15/06/18.
 */
public class Main {
    public static void main(String...args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data23/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"" );
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
