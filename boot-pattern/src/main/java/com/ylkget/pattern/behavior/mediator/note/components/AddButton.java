package com.ylkget.pattern.behavior.mediator.note.components;

import com.ylkget.pattern.behavior.mediator.note.mediator.Mediator;
import com.ylkget.pattern.behavior.mediator.note.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 21:16
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
