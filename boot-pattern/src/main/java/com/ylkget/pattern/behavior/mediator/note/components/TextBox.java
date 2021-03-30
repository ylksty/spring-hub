package com.ylkget.pattern.behavior.mediator.note.components;

import com.ylkget.pattern.behavior.mediator.note.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 21:13
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
