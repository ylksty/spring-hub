package com.ylkget.pattern.behavior.mediator.note;

import com.ylkget.pattern.behavior.mediator.note.components.*;
import com.ylkget.pattern.behavior.mediator.note.mediator.Editor;
import com.ylkget.pattern.behavior.mediator.note.mediator.Mediator;

import javax.swing.*;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/30 21:07
 */
public class Clident {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
