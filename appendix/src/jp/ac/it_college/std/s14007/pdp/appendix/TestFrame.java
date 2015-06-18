package jp.ac.it_college.std.s14007.pdp.appendix;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by s14007 on 15/06/18.
 */
public class TestFrame extends Frame implements WindowListener {
    private Label left;
    private Label right;

    public TestFrame() {
        super("Serial test");
        addWindowListener(this);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(1, 2));
        left = new Label("左");
        right = new Label("右");
        left.setBackground(Color.lightGray);
        right.setBackground(Color.lightGray);
        add(left);
        add(right);

        pack();
        show();
    }

    public void changeLeftColor() {
        if (left.getBackground() == Color.blue) {
            left.setBackground(Color.lightGray);
        } else {
            left.setBackground(Color.blue);
        }
    }

    public void changeRightColor() {
        if (right.getBackground() == Color.red) {
            right.setBackground(Color.lightGray);
        } else {
            right.setBackground(Color.red);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
