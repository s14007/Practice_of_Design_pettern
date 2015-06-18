package jp.ac.it_college.std.s14007.pdp.composite.iterator.observer;

/**
 * Created by s14007 on 15/06/16.
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }

}
