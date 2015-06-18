package jp.ac.it_college.std.s14007.flyweight;

import java.util.HashMap;

/**
 * Created by s14007 on 15/06/17.
 */
public class BigCharFactory {
    private HashMap<Character, BigChar> pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get(charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(charname, bc);
        }
        return bc;
    }
}
