package jp.ac.it_college.std.s14007.pdp.appendix;

/**
 * Created by s14007 on 15/06/18.
 */
public class Main {
    public static void main(String...args) {
        TestFrame test = new TestFrame();
        new LeftTread(test, 670).start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            test.changeRightColor();
        }
    }
}
