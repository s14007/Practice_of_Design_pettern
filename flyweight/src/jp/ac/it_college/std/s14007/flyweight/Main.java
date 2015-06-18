package jp.ac.it_college.std.s14007.flyweight;

/**
 * Created by s14007 on 15/06/17.
 */
public class Main {
    public static void main(String...args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}