package jp.ac.it_college.std.s14007.pdp.strategy;

import java.util.Random;

/**
 * Created by s14007 on 15/06/14.
 */
public class WinnerStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
