package jp.ac.it_college.std.s14007.decorator;

/**
 * Created by s14007 on 15/06/16.
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("こんにちは。")),'*'))),'/');
        b4.show();
    }
}
