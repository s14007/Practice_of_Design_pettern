package jp.ac.it_college.std.s14007.pdp.composite.iterator.observer;

/**
 * Created by s14007 on 15/06/16.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
