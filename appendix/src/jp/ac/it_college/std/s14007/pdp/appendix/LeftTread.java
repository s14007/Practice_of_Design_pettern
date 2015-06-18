package jp.ac.it_college.std.s14007.pdp.appendix;

/**
 * Created by s14007 on 15/06/18.
 */
public class LeftTread extends Thread {
    private int sleepTime;
    private TestFrame frame;

    public LeftTread(TestFrame frame, int sleepTime) {
        this.frame = frame;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                //
            }
            frame.changeLeftColor();
        }
    }
}
