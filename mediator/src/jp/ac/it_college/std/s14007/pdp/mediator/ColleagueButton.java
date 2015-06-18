package jp.ac.it_college.std.s14007.pdp.mediator;

import java.awt.Button;

/**
 * Created by s14007 on 15/06/16.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
