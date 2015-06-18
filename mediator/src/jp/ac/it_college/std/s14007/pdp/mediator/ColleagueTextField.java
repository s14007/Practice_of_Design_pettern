package jp.ac.it_college.std.s14007.pdp.mediator;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by s14007 on 15/06/16.
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
