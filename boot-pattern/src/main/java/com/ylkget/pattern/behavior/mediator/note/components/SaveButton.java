package com.ylkget.pattern.behavior.mediator.note.components;

import com.ylkget.pattern.behavior.mediator.note.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 21:17
 */
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
